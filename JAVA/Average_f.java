import java.util.*;

public class Average_f {

    public static int Avg (int a, int b, int c) {

        int n = (a + b + c) / 3;

        return n;
    }
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("This program will help you to find average of 3 numbers.");

        System.out.print("Please enter first digite : ");
        int a = sc.nextInt();
        System.out.print("Please enter second digite : ");
        int b = sc.nextInt();
        System.out.print("Please enter third digite : ");
        int c = sc.nextInt();

        sc.close();

        System.out.println(Avg (a,b,c));
    }
}
