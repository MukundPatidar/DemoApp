package LeetCode;

public class ValidNumber {
	public static boolean isNumber(String s) {
		s = s.toLowerCase();
		boolean status = false;

		for (int i = 0; i < s.length(); i++) {
			char curChar = s.charAt(i);
			if (status && (curChar == '.' || curChar == 'e')) {
				return false;
			}

			if (curChar == 'e') {
				status = true;
			}

			if (!(isValid(i, curChar, s))) {
				return false;
			}
		}

		return true;
	}

	static boolean isValid(int idx, char ch, String s) {
		switch (ch) {
			case '+':
				if (idx == 0 || s.charAt(idx - 1) == 'e') {
					return true;
				} else {
					return false;
				}
			case '-':
				if (idx == 0 || s.charAt(idx - 1) == 'e') {
					return true;
				} else {
					return false;
				}
			case '.':
				if (((idx - 1) >= 0)) {
					return true;
				} else {
					return false;
				}
			case 'e':
				if (((idx - 1) >= 0) && (idx + 1 < s.length())
						&& (s.charAt(idx - 1) >= '0' && s.charAt(idx - 1) <= '9')) {
					return true;
				} else {
					return false;
				}
			default:
				if ((ch >= '0' && ch <= '9')) {
					return true;
				} else {
					return false;
				}
		}
	}

	public static void main(String[] args) {
		String str1[] = { "2", "0", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93",
				"-123.456e789" };
		String str2[] = { "e", ".", "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53", };

		for (String string : str1) {
			System.out.println(isNumber(string));
		}

		System.out.println();
		System.out.println();

		for (String string : str2) {
			System.out.println(isNumber(string));
		}
	}
}
