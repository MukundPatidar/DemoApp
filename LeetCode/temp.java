package LeetCode;

public class temp {
	public static void main(String args[]) {
		char ch = 'A';

		int n = 6;

		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				if (j % 2 != 0) {
					System.out.print(Character.toLowerCase(ch) + " ");
				} else {
					System.out.print(ch + " ");
				}
				ch++;
			}
			System.out.println();
		}
	}
}
