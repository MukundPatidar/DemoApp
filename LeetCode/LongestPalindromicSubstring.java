package LeetCode;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("cbbd"));
	}

	public static String longestPalindrome(String s) {
		String ans = s.charAt(0) + "";

		for (int i = 0; i < s.length() - ans.length(); i++) {
			for (int j = s.length() - 1; j > i; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					if (isPalindrom(s.substring(i, j + 1))) {
						if (ans.length() < s.substring(i, j + 1).length()) {
							ans = s.substring(i, j + 1);
						}
					}
				}
			}
		}

		return ans;
	}

	public static boolean isPalindrom(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(right) != s.charAt(left)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}