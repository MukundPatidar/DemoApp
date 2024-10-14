package simpleQ;
import java.util.Scanner;

public class somodd_f {
    public static int Ocal (int n) {
       int z = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 0) {}
            else {
                z = z + i;
            }
        }
        return z;
    }
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis program will help you to find sum  of odd numbers till n.\n");

        System.out.print("Please enter a number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(Ocal (n));
    }
}
