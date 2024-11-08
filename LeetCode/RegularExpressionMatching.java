package LeetCode;

public class RegularExpressionMatching {
	public static boolean isMatch(String s, String p) {
		int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                }
            }
        }
        return dp[m][n];


		// if (p.contains(".*")) {
		// 	if (p.length() > s.length()) {
		// 		return false;
		// 	}
		// 	return true;
		// }
		// if(s == "aaa" && p == "ab*a*c*a"){
        //     return true;
        // }

		// boolean status = false;
		// boolean onlyDot = true;
		// StringBuilder s1 = new StringBuilder(s);
		// StringBuilder p1 = new StringBuilder(p);

		// while (p1.toString().contains("*")) {
		// 	int idx = p1.indexOf("*") - 1;

		// 	while (s1.length() > 0 && s1.charAt(idx) == p1.charAt(idx)) {
		// 		s1.deleteCharAt(idx);
		// 	}

		// 	p1.deleteCharAt(idx);
		// 	p1.deleteCharAt(idx);
		// }

		// int idx = 0, i;
		// for (i = 0; (i < s1.length() && idx < p1.length()); i++) {
		// 	if (p1.charAt(idx) == '.') {
		// 		idx++;
		// 		continue;
		// 	}
		// 	if (onlyDot) {
		// 		onlyDot = false;
		// 	}

		// 	if (p1.charAt(idx) != s1.charAt(i)) {
		// 		status = false;
		// 	} else {
		// 		status = true;
		// 	}

		// 	idx++;
		// }

		// if (onlyDot && s.length() == p.length()) {
		// 	return true;
		// } else if (status && (i != s1.length() || idx != p1.length())) {
		// 	return false;
		// }

		// return status;
	}

	public static void main(String[] args) {
		System.out.println(isMatch("ab", ".*a"));
		System.out.println(isMatch("aa", "a"));
		System.out.println(isMatch("patidarmukund", "m.k.nd"));
		System.out.println();
		System.out.println();
		System.out.println(isMatch("aaa", "ab*a*c*a"));
		System.out.println(isMatch("aa", "a*"));
		System.out.println(isMatch("mississippi", "mis*is*ip*."));
		System.out.println(isMatch("abcd", "abcd"));
		System.out.println(isMatch("aa", ".*"));
		System.out.println(isMatch("abcc", "a.c*"));
		System.out.println(isMatch("a-c", "a.c"));
		System.out.println(isMatch("a1c", "a.c"));
		System.out.println(isMatch("aa", ".."));
		System.out.println(isMatch("!!", ".."));
		System.out.println(isMatch("!%", ".."));
		System.out.println(isMatch("! %", "..."));
		System.out.println(isMatch("abbbbbbbbce@", "ab*cd*e."));
	}
}