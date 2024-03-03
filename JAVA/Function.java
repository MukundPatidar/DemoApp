import java.util.*;

public class Function {

    public static void Table (int a, int i) {

        for(i=1; i<=10; i++) {
            System.out.printf("%d * %d = %d \n", a, i, a * i);
          }
    }

    public static void main (String args[]) {


        try (//input
        Scanner sc = new Scanner(System.in)) {

             System.out.print("Pleas enter a number  = ");

        int a = sc.nextInt(); 
        
        Table(a, a);
        sc.close();
        }
    }
}
