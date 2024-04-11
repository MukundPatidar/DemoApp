package Experiments;

public class BitwiseOperators {
    public static void main (String [] args) {
        int num1 = 5, num2 = 7;
        //AND operation
        int and = num1 & num2;
        //OR operation
        int or = num1 | num2;
        //Ex-OR operation
        int xor = num1 ^ num2;
        System.out.println("And operation result: "+ and);
        System.out.println("OR operation result: "+ or); 
        System.out.println("Ex-OR operation result: "+ xor);
    }
}