package Experiments;

public class MultipleExceptionHandlingDemo {

    public static void performOperations(String[] array, String numberStr) {
        try {
            String element = array[array.length];
            
            int number = Integer.parseInt(numberStr);
            
            System.out.println("Element accessed: " + element);
            System.out.println("Number parsed: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Number format exception. Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        String[] array = {"Java", "Python", "C++"};
        performOperations(array, "123"); 

        System.out.println("\nTest Case 2:");
        String[] emptyArray = {};
        performOperations(emptyArray, "456");

        System.out.println("\nTest Case 3:");
        String[] validArray = {"Java", "Python", "C++"};
        performOperations(validArray, "abc");
    }
}