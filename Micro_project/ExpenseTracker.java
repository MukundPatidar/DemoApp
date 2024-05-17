import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    private String item;
    private double amount;

    public Expense(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}

public class ExpenseTracker {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String item, double amount) {
        expenses.add(new Expense(item, amount));
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        System.out.println("Expense List:");
        System.out.println("Item\t\tAmount");
        for (Expense expense : expenses) {
            System.out.println(expense.getItem() + "\t\t" + expense.getAmount());
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseTracker tracker = new ExpenseTracker();

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
                    System.out.print("Enter item name: ");
                    String item = scanner.next();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    tracker.addExpense(item, amount);
                    System.out.println("Expense added successfully.");
                    break;
                case 2:
                    tracker.displayExpenses();
                    break;
                case 3:
                    System.out.println("Total Expenses: $" + tracker.getTotalExpenses());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
