import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first num. : ");
        int a = sc.nextInt();

        System.out.print("Enter Second num. : ");
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a);
        System.out.println(b);
    }
}
