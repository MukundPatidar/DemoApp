package LeetCode;

public class FirstOccurrenceInAString {
	public static int strStr(String haystack, String needle) {
		int ans = -1;

		if(haystack.contains(needle))
			return haystack.indexOf(needle);

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(strStr("sadbutsad", "sad"));// 0
		System.out.println(strStr("leetcode", "leeto"));// -1
	}
}
