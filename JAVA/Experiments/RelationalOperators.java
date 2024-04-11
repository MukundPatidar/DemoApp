package Experiments;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        sc.close();
        if(marks >= 0 && marks < 33) {
            System.out.println("Fail");
        } else if(marks >= 33 && marks <= 50) {
            System.out.println("Pass with C grade");
        } else if(marks > 50 && marks < 75) {
            System.out.println("Pass with B grade");
        } else if(marks > 75 && marks <=100) {
            System.out.println("Pass with A grade");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}