import java.util.*;
public class CircleR {
    public static void main(String args[]) {
        try (//input
        Scanner sc = new Scanner(System.in)) {
        int r = sc.nextInt();
        double mul = 3.141592653 * (r * r);
        int dai = r * 2;
        double a = 2 * 3.141592653 * r;
        System.out.println("Radius = "+r);
        System.out.println("Diameter = "+dai);
        System.out.println("Area = "+mul);
        System.out.println("Circumference = "+a);
        }
    }
}
