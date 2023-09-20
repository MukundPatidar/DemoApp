import java.util.*;

public class Marks {
    
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This programe will help you find out percentege of exam");

        System.out.print("Sub. 1 no. : ");
       double Sub1 = sc.nextDouble();

        System.out.print("Sub. 2 no. : ");
       double Sub2 = sc.nextDouble();

        System.out.print("Sub. 3 no. : ");
       double Sub3 = sc.nextDouble();

        System.out.print("Sub. 4 no. : ");
       double Sub4 = sc.nextDouble();

        System.out.print("Sub. 5 no. : ");
       double Sub5 = sc.nextDouble();

        double a = Sub1 + Sub2 + Sub3 + Sub4 + Sub5;
        double b = 5 * 100;

        double total = ((a/b)*100);

        // float total = ((Sub1 + Sub2 + Sub3 + Sub4 + Sub5) / (Out1 + Out2 + Out3 + Out4 + Out5))*100;

        System.out.println("Your score is "+total+"%");
    }
}
