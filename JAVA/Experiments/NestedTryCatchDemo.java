package Experiments;

public class NestedTryCatchDemo {

    public static void performOperations(int[] array, int dividend, int divisor) {
        try {
            try {
                int element = array[array.length]; 
                System.out.println("Element accessed: " + element);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch (ArrayIndexOutOfBoundsException): " + e.getMessage());
            }

            int result = dividend / divisor; 
            System.out.println("Result of division: " + result); 
        } catch (ArithmeticException e) {
            System.out.println("Outer catch (ArithmeticException): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        int[] array = {1, 2, 3};
        performOperations(array, 10, 2); 

        System.out.println("\nTest Case 2:");
        performOperations(array, 10, 0); 
    }
}