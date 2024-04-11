import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextInt();

        System.out.print("Enter the operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result: "+(num1 + num2));
                break;

            case '-':
                System.out.println("Result: "+(num1 - num2));
                break;

            case '*':
                System.out.println("Result: "+(num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result: "+(num1 / num2));
                    break;    
                } else { 
                    System.out.println("Error: Cannot divide by zero!");
                    break; }

            case '%':
                if (num2 != 0) {
                    System.out.println("Result: "+(num1 % num2));
                    break;    
                } else { 
                    System.out.println("Error: Cannot divide by zero!");
                    break; }
                    
            default:
                System.out.println("Invalid operator");
                break;
        }

        sc.close();
    }
}