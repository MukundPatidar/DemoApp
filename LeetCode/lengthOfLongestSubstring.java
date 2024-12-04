package LeetCode;

public class lengthOfLongestSubstring {
    public static int length(String s) {
        StringBuilder str = new StringBuilder();
        boolean status = true;

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(s.charAt(i) == str.charAt(j)){
                    status = false;
                    break;
                }
            }
            if(status == true){
                str.append(s.charAt(i));
            }
        }

        return str.length();
    }

    public static void main(String[] args) {
        System.out.println(length("abcabcbb"));
        System.out.println(length("bbbbb"));
        System.out.println(length("pwwkew"));
    }
}
