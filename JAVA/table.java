import java.util.Scanner;

public class table {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in) ;
      int a, i, x ;

      do{
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        for(i=1; i<=10; i++) {
          System.out.printf("%d * %d = %d \n", a, i, a * i);
        }

        System.out.println("want to continue ? (Yes(1) or No(0))");
        x = sc.nextInt();
          
        } while(x == 1);
    }
}