import java.util.*;

public class Sum_odd {
    public static void main (String args []){

        int n,x=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        n = sc.nextInt();

        for(int i=0; i<=n; i++){
            if(i % 2 != 0){
                x += i;
            }
        }
        sc.close();
        System.out.println("Sum of all odd numbers till "+n+" is : "+x);
    }
}