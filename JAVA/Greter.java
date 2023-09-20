import java.util.Scanner;

public class Greter {

    public static void grt (int a, int b) {

        if (a < b) {
            System.out.println(b+" is gretar than "+a);
        } else if (a > b) {
            System.out.println(a+" is gretar than "+b);
        } else if (a == b || b == a ) {
            System.out.println("Given number are equal");
        } else {
            System.out.println("Given number are invalide");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        Greter exObj = new Greter();
        exObj.grt(a, b);;
        // System.out.println(grt(a, b));
    }
}
