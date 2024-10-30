package LeetCode;

public class RomanToInteger {
    public int romanToInt(String s) {
        s  = s.toUpperCase();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int next = Math.min(s.length()-1, i+1);

            switch (ch) {
                case 'I':
                    if(s.charAt(next) == 'X'){
                        ans += 9;
                        i++;
                    } else if(s.charAt(next) == 'V'){
                        i++;
                        ans += 4;
                    } else {
                        ans++;
                    }
                    break;
                    case 'V':
                    ans += 5;
                    break;
                    case 'X':
                    if(s.charAt(next) == 'L'){
                        i++;
                        ans += 40;
                    } else if(s.charAt(next) == 'C'){
                        i++;
                        ans += 90;
                    } else {
                        ans+=10;
                    }
                    break;
                    case 'L':
                    ans += 50;
                    break;
                    case 'C':
                    if(s.charAt(next) == 'M'){
                        i++;
                        ans += 900;
                    } else if(s.charAt(next) == 'D'){
                        i++;
                        ans += 400;
                    } else {
                        ans+=100;
                    }
                    break;
                    case 'D':
                    ans += 500;
                    break;
                    case 'M':
                    ans += 1000;
                    break;
            }
        }

        return ans;
    }
}
