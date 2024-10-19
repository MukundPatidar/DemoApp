package LeetCode;
import java.util.*;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        String str = digits.toString();
        double n = Double.valueOf(str);
        n++;
        str = String.valueOf(n);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            arr[i] = Integer.parseInt(ch.toString());
        }

        return arr;
    }
}

// ArrayList<Integer> arrayList = new ArrayList<Integer>();

// for (int i = digits.length-1; i >= 0; i++) {
//     digits[i]++;
//     if(digits[i] != 10){
//         break;
//     } else {
//         digits[i]--;
//     }
// }


// int[] array = new int[arrayList.size()];
// for (int i = 0; i < arrayList.size(); i++) {
//     array[i] = arrayList.get(i);
// }
// return array;