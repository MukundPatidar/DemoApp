package LeetCode;

public class WildcardMatching {
	public static boolean isMatch(String s, String p) {
		if (s.length() != p.length() && !p.contains("*")) {
			return false;
		}

		int sidx = 0;
		int pidx = 0;

		while (sidx < s.length() && pidx < p.length()) {
			if (s.charAt(sidx) == p.charAt(pidx)) {
				sidx++;
				pidx++;
				System.out.println("if");
				System.out.println(sidx);
				System.out.println(pidx);
			} else if (p.charAt(pidx) == '?') {
				sidx++;
				pidx++;
				System.out.println("else ?");
				System.out.println(sidx);
				System.out.println(pidx);
			} else if (p.charAt(pidx) == '*') {
				int idx = (pidx < p.length() - 1) ? ++pidx : pidx;
				while (sidx < s.length() && p.charAt(idx) != s.charAt(sidx)) {
					sidx++;
				}
				System.out.println("else *");
				System.out.println(sidx);
				System.out.println(pidx);
			} else {
				System.out.println("else");
				System.out.println(sidx);
				System.out.println(pidx);
				return false;
			}
		}

		if (sidx != s.length() && pidx != p.length()) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isMatch("abcabczzzde", "*abc???de*"));
	}
}
