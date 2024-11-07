package LeetCode;

public class temp {
	public static void isPowerOf2(int n) {
		int count = 0;
		int x = n;

		while (x > 0) {
			if ((x & 1) == 1)
				count++;

			x = x >> 1;

		}

		if (count == 1) {
			System.out.println(n);
		}
	}

	public static void main(String args[]) {
		for (int i = 1; i < 100000; i++) {
			isPowerOf2(i);
		}
	}
}
