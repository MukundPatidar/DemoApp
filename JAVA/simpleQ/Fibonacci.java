package simpleQ;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Fibonacci series : ");
        int length = sc.nextInt();
        sc.close();

       int fib[] = new int[length];
       fib[0] = 0;
       fib[1] = 1;
       fib[2] = 1;

       for (int i = 3; i < length; i++) {
            fib[i] = fib[i-2] + fib[i-1];
       }

       for (int i = 0; i <= length; i++) {
        System.out.print(fib[i] + " ");
       }
    }
}