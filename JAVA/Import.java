import java.util.*;
public class Import {
    public static void main(String args[]) {
        try (//input
        Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            //next()for word
            //nextLine()for line
            //nextInt()for intiger
            //nextFloat()for desimal
            int sum = a + b; 

            System.out.println("Total = "+sum);
        } 
    }
}
