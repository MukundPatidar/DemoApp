package Experiments;

import java.util.Scanner;

public class StringComparisonExample {

    public static void main(String[] args) {
       
        String passwordSetByUser = ""; 
        String confirmPassword = "";   

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        passwordSetByUser = scanner.nextLine();
        
        System.out.print("Confirm your password: ");
        confirmPassword = scanner.nextLine();
        
        if (passwordSetByUser.equals(confirmPassword)) {
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Passwords do not match. Please try again.");
        }
        
        scanner.close();
    }
}