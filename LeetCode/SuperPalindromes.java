package LeetCode;

public class SuperPalindromes {
	public static void main(String[] args) {
		// System.out.println(superpalindromesInRange("40000000000000000", "50000000000000000"));
		// String str = String.format("%.0f", 50000000000000000.541645);
		double d = 50000000000000000.0;
		double d1 = 50000000000000000.5465445;
		System.out.println(Math.abs(d % 1) > 1e-10);
		System.out.println(Math.abs(d1 % 1) > 1e-10);
	}

	public static int superpalindromesInRange(String left, String right) {
		int ans = 0;

		double leftNum = Math.floor(Math.sqrt(Long.parseLong(left)));
		double rightNum = Math.ceil(Math.sqrt(Long.parseLong(right)));

		for (double i = leftNum; i <= rightNum; i++) {
			if (((i * i) != (long) (i * i))) {
				System.out.println(i);
				continue;
			}

			if (isPalindrome(Double.toString(i))) {
				if (isPalindrome(Double.toString(i * i))) {
					ans++;
				}
			}
		}

		return ans;
	}

	public static boolean isPalindrome(String s) {
		for (int i = s.indexOf(".") + 1; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				return false;
			}
		}

		int left = 0;
		int right = s.indexOf(".") - 1;
		while (left < right) {
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