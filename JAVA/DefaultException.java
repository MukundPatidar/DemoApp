public class DefaultException {
	static void subroutine() {
		int d = 0;
		int a = 10 / d;
		System.out.println(a);
	}

	public static void main(String args[]) {
		subroutine();
	}
}
