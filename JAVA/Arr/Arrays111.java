package Arr;
import java.util.*;


public class Arrays111 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
      sc.close();

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
     
       for(int i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }

public static Object stream(int[] dp) {
    throw new UnsupportedOperationException("Unimplemented method 'stream'");
}

public static void sort(int[] nums1) {
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
}

public static List<Integer> asList(int i, int j, int k, int l) {
    throw new UnsupportedOperationException("Unimplemented method 'asList'");
}
}
