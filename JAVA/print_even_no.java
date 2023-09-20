import java.util.*;

public class print_even_no {
     public static void main(String args[]) {
        try (//input
        Scanner sc = new Scanner(System.in)) {
            int n;
            int j;
            int a;
         do{
            n = sc.nextInt();
              for(j=1; j<=n; j++) {
                 if(j % 2 == 0) {
                    System.out.println(j);
                 }
              }
              System.out.println("Want to continue ? [yes(1) or no(0)]");
              a = sc.nextInt();
            }while(a == 1);
        }
     } 
}
