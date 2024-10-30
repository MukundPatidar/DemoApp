package LeetCode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String str[] = { "flower", "flow", "flight" };
		String str1[] = { "dog", "racecar", "car" };
		System.out.println(longestCommonPrefix(str));
		System.out.println(longestCommonPrefix(str1));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder str = new StringBuilder(strs[0]);

		int i, j;
		for (i = 1; i < strs.length; i++) {
			for (j = 0; j < Math.min(strs[i].length(), str.length()); j++) {
				if (str.charAt(j) != strs[i].charAt(j)) {
					str.delete(j, str.length());
					break;
				}
			}
			str.delete(j, str.length());
		}

		return str.toString();
	}
}