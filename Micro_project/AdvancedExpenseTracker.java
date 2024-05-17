import java.util.*;
import java.util.Date;
import java.sql.*;

class Expense {
    private String name;
    private double amount;
    private String category;
    private Date date;

    public Expense(String name, double amount, String category, Date date) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }
}

public class AdvancedExpenseTracker {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            connectToDatabase();
            createTablesIfNotExist();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Advanced Expense Tracker!");

            while (true) {
                System.out.println("\nExpense Tracker Menu:");
                System.out.println("1. Add Expense");
                System.out.println("2. View Expenses");
                System.out.println("3. View Total Expenses");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addExpense(scanner);
                        break;
                    case 2:
                        viewExpenses();
                        break;
                    case 3:
                        viewTotalExpenses();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        disconnectFromDatabase();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void connectToDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:expense_tracker.db");
    }

    private static void createTablesIfNotExist() throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS expenses (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "amount REAL," +
                "category TEXT," +
                "date DATE);");
        statement.close();
    }

    private static void addExpense(Scanner scanner) throws SQLException {
        System.out.print("Enter expense name: ");
        String name = scanner.next();
        System.out.print("Enter expense amount: $");
        double amount = scanner.nextDouble();
        System.out.print("Enter expense category: ");
        String category = scanner.next();

        Date date = new Date(); // Current date

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO expenses (name, amount, category, date) VALUES (?, ?, ?, ?)");
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, amount);
        preparedStatement.setString(3, category);
        preparedStatement.setDate(4, (java.sql.Date) date);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        System.out.println("Expense added successfully.");
    }

    private static void viewExpenses() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM expenses");

        System.out.println("\nExpenses:");
        System.out.println("ID\tName\tAmount\tCategory\tDate");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            double amount = resultSet.getDouble("amount");
            String category = resultSet.getString("category");
            Date date = resultSet.getDate("date");

            System.out.println(id + "\t" + name + "\t$" + amount + "\t" + category + "\t\t" + date);
        }

        resultSet.close();
        statement.close();
    }

    private static void viewTotalExpenses() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT SUM(amount) AS total FROM expenses");

        if (resultSet.next()) {
            double total = resultSet.getDouble("total");
            System.out.println("Total Expenses: $" + total);
        }

        resultSet.close();
        statement.close();
    }

    private static void disconnectFromDatabase() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
