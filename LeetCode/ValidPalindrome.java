package LeetCode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        s = s.trim();
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) >= 'a' && s.charAt(left) <= 'z' || s.charAt(left) >= '0' && s.charAt(left) <= '9') {
            } else {
                left++;
                continue;
            }
            if (s.charAt(right) >= 'a' && s.charAt(right) <= 'z' || s.charAt(right) >= '0' && s.charAt(right) <= '9') {
            } else {
                right--;
                continue;
            }

            if (s.charAt(right) != s.charAt(left)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}
