package LeetCode;

public class StudentAttendanceRecord1 {
	public boolean checkRecord(String s) {
		if (s.contains("LLL"))
			return false;
		if (s.indexOf("A") != s.lastIndexOf("A"))
			return false;
		return true;

		// int A = 0;
		// int L = 0;

		// for (int i = 0; i < s.length(); i++) {
		// switch (s.charAt(i)) {
		// case 'A':
		// A++;
		// break;
		// case 'L':
		// L++;
		// break;
		// }
		// }

		// if (A < 2 && (L < 3 || !(s.contains("LLL"))))
		// return true;

		// return false;
	}
}
