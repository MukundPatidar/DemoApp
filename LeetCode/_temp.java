package LeetCode;

<<<<<<< HEAD:LeetCode/temp.java
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

=======
public class _temp {
>>>>>>> 502eb135feaa78e0ade5977059044530f5f7c407:LeetCode/_temp.java
	public static void main(String args[]) {
		for (int i = 1; i < 100000; i++) {
			isPowerOf2(i);
		}
	}
}
