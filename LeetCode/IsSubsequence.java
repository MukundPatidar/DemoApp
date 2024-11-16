package LeetCode;

public class IsSubsequence {
	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length()) {
			return false;
		}

		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			String subS = t.substring(idx, t.length());
			if (subS.contains(s.charAt(i) + "")) {
				idx = t.indexOf(s.charAt(i)) + 1;
				t = subS;
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "aaaaaa";
		String t = "bbaaaa";
		System.out.println(isSubsequence(s, t));
	}
}
