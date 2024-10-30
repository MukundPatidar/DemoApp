package LeetCode;

public class StringToInteger_atoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        boolean status = false;
        double ans = 0;
        StringBuilder str = new StringBuilder(s);

        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            str.deleteCharAt(0);
            status = true;
        }

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                ans *= 10;
                ans += (ascii - 48);
            } else {
                break;
            }
        }

        if (status == true && s.charAt(0) != '+') {
            ans *= -1;
        }

        return (int) ans;
    }
}
