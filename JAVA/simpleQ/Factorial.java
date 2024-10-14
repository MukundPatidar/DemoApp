package simpleQ;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose factorial is required : ");
        int num = sc.nextInt();
        int factorial = 1;

        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of "+num+" is : "+factorial);
        sc.close();
    }
}
