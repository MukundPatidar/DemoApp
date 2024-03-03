import java.util.*;

public class Arrays1 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int i,j,temp;

        //Array size
        System.out.print("how many numbers entering : ");
        int size = sc.nextInt();
        
        //Array
        int ace[] = new int[size];
        
        //Array input
        for (i=0; i<ace.length; i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            ace [i] = sc.nextInt();
        }
        
        sc.close();
        //Array sorte
        for (i=0; i<ace.length; i++) {
            for (j=i+1; j<ace.length; j++) {
                
                if (ace[i] > ace[j]) {
                    temp = ace[i];
                    ace[i] = ace[j];
                    ace [j] = temp;
                }
            }
        }

        //Print sorted array
        for (i=0; i<ace.length; i++) {
            System.out.print(ace[i] + ", ");
        }
    }
}
