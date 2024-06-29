package Experiments;

public class ThrowDemo {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Test Case 1:");
            checkAge(20); 

            System.out.println("\nTest Case 2:");
            checkAge(15); 
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}