package simpleQ;
import java.util.Scanner;

abstract class Bank {
    public String Name = "myBank";
    public String IFSC = "myBank123";

    public void bankDetail() {
        System.out.println("Bank_Name: " + Name + " " + "Bank_IFSC Code: " + IFSC);
    }

    // Password: 123
    abstract void Deposite();

    abstract void withdraw();

    abstract void checkBal();
}

class bankService extends Bank {
    private double bal = 5000;
    private int pwd;
    public double money;

    public void Deposite() {
        System.out.print("Enter Password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.print("Enter Deposite Amount: ");
            money = s.nextDouble();
            bal = bal + money;
            System.out.println("Deposited Money: " + money);
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
        s.close();
    }

    public void withdraw() {
        System.out.print("Enter Password ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.print("Enter withdraw Amount: ");
            money = s.nextDouble();
            bal = bal - money;
            System.out.println("withdraw Money: " + money);
            System.out.println("Total Balance: " + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
        s.close();
    }

    public void checkBal() {
        System.out.print("Enter Password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.print("Total Balance: " + bal);
        } else {
            System.out.print("wrong password");
        }
        s.close();
    }
}

public class Customer {
    public static void main(String[] args) {
        bankService b = new bankService();
        b.bankDetail();
        int ch;
        System.out.println("1. Deposite: ");
        System.out.println("2. withdraw: ");
        System.out.println("3. checkBalance: ");
        System.out.print("\n Enter Your choice: ");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();
        switch (ch) {
            case 1:
                b.Deposite();
                break;
            case 2:
                b.withdraw();
                break;
            case 3:
                b.checkBal();
                break;
            default:
                System.out.print("Invalid choice:");
                break;
        }
        s2.close();
    }
}