import java.util.*;

public class Array {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("How many names you are entering : ");
    int size = sc.nextInt();
    int i;

    String name [] = new String [size];

    //input
    for(i=0; i<name.length; i++){
        System.out.print("Enter name "+(i+1)+" :");
        name [i] = sc.next();
      }
      sc.close();
    //output
    System.out.println("Your enterd name is.");
    for(i=0; i<name.length; i++) {
        System.out.println((i+1)+" - "+name [i]);
     }
    }
}
