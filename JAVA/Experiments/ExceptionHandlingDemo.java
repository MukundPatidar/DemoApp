package Experiments;

public class ExceptionHandlingDemo {

    public static void performDivision(int dividend, int divisor) {
        try {
            int result = dividend / divisor; 
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero attempted. Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        performDivision(10, 2);

        System.out.println("\nTest Case 2:");
        performDivision(8, 0);

        System.out.println("\nTest Case 3:");
        performDivision(20, 4);
    }
}