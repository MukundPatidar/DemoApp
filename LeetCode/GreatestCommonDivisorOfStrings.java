package LeetCode;

public class GreatestCommonDivisorOfStrings {
	public static String gcdOfStrings(String str1, String str2) {
		StringBuilder str = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		if (str1.length() != Math.min(str1.length(), str2.length())) {
			String tem = str1;
			str1 = str2;
			str2 = tem;
		}

		for (int i = 0; i < str1.length(); i++) {
			temp.append(str1.charAt(i));
		}

		return str.toString();
	}

	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCABC", "ABC"));
	}
}