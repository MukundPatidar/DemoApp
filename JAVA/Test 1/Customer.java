//Creating ATM program using encapsulation

import java.util.Scanner;

class Bank {
    private double bal = 5000;
    private int pwd;
    public double money;

    public void Deposite() {

        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd != 123) {
            System.out.println("Incorrect Password.");
        } else {
            System.out.print("Enter Deposite Amount : ");
            money = s.nextDouble();
            bal = bal + money;
            System.out.println("Deposited Money : " + money);
            System.out.println("Total Balance : " + bal);
        }
        s.close();
    }

    public void withdraw() {

        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd != 123) {
            System.out.println("Incorrect Password.");
        } else {
            System.out.print("Enter withdraw Amount : ");
            money = s.nextDouble();
            bal = bal - money;
            System.out.println("withdraw Money : " + money);
            System.out.println("Total Balance : " + bal);
        }
        s.close();
    }

    public void checkBal() {

        System.out.print("Enter Password : ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();

        if (pwd != 123) {
            System.out.print("Incorrect Password.");
        } else {
            System.out.print("Total Balance : " + bal);
        }
        s.close();
    }
}

public class Customer {
    public static void main(String[] args) {
        Bank b = new Bank();
        
        System.out.println("welcome to xyz bank.");
        System.out.println("1. Deposite");
        System.out.println("2. withdraw");
        System.out.println("3. checkBalance");
        System.out.print("\nEnter Your choice : ");

        Scanner s2 = new Scanner(System.in);
        int ch = s2.nextInt();

        switch (ch) {
            case 1 :
                b.Deposite();
                break;
            case 2 :
                b.withdraw();
                break;
            case 3 :
                b.checkBal();
                break;
            default :
                System.out.print("Invalid choice :");
                break;
        }
        s2.close();
    }
}