
public class temp {
	public static void main(String[] args) {
		int x = 2147483647;
		if (x == 0) {
			System.out.println(0);
			return;
		}
		for (int i = 1; i < x; i++) {
			if (i * i == x) {
				System.out.println(i);
				return;
			} else if (i * i > x) {
				System.out.println(i-1);
				return;
			}
		}
		System.out.println(1);
		return;
	}
}
