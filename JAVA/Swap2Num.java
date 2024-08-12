
import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a);
            System.out.println(b);
            a += b;
            b = a-b;
            a -= b;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
