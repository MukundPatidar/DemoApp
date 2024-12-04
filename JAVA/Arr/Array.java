package Arr;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {

      try (Scanner mp = new Scanner(System.in)) {
        System.out.print("How many names you are entering : ");
        int size = mp.nextInt();
        int i;

        String name [] = new String [size];

        //input
        for(i=0; i<name.length; i++){
            System.out.print("Enter name "+(i+1)+" :");
            name [i] = mp.next();
          }
          mp.close();
        //output
        System.out.println("Your enterd name is.");
        for(i=0; i<name.length; i++) {
            System.out.println((i+1)+" - "+name [i]);
        }
      }
    }

    public static List<Integer> asList(int i, int j, int k, int l) {
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
