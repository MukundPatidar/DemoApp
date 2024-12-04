package LeetCode;

import java.util.Scanner;

public class ReverseString {
    public static StringBuilder reverseString (StringBuilder str){
        for(int i = 0; i < (str.length()/2); i++){
            char firstChar = str.charAt(i);
            char lastChar = str.charAt(str.length()-1-i);
            str.setCharAt(i, lastChar);
            str.setCharAt(str.length()-1-i, firstChar);
        }
        return str;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1 = sc.nextLine();
            StringBuilder str = new StringBuilder(str1);
            System.out.println(reverseString(str));
        }
    }
}