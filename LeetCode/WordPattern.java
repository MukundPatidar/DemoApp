package LeetCode;

import java.util.Arrays;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String regex = "[,\\.\\s]";
        String[] arr = s.split(regex);

        if(arr.length != pattern.length()){
            return false;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            char ch = pattern.charAt(i);
            String str = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(ch == pattern.charAt(j) && str.equals(arr[j]) != true){
                    return false;
                } else if(ch != pattern.charAt(j) && str.equals(arr[j]) == true){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]){
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }
}
