package LeetCode;

public class _temp {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i+", ");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false; // Numbers less than or equal to 1 are not prime
		if (n <= 3)
			return true; // 2 and 3 are prime numbers
		if (n % 2 == 0 || n % 3 == 0)
			return false; // Exclude multiples of 2 and 3

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
