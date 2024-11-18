package LeetCode;

public class SuperPalindromes {
	public static void main(String[] args) {
		System.out.println(superpalindromesInRange("40000000000000000", "50000000000000000"));
	}

	public static int superpalindromesInRange(String left, String right) {
		int ans = 0;

		Long leftNum = Long.parseLong(left);
		Long rightNum = Long.parseLong(right);

		for (Long i = leftNum; i <= rightNum; i++) {
			String num = Long.toString(i);

			if (isPalindrome(num)) {
				Double temp = Math.sqrt(i);
				String sqrt = Double.toString(temp);

				if (isPalindrome(sqrt)) {
					ans++;
				}

			}
		}

		return ans;
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = 0;

		boolean status = false;
		for (int i = 0; i < s.length(); i++) {
			if (status && s.charAt(i) != '0') {
				return false;
			}
			if (s.charAt(i) == '.') {
				right = i - 1;
				status = true;
			}
		}

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