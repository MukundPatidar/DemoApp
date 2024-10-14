public class MultipleException {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b = 10 / a;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Generic Exception catch.");
		} 
		// catch (ArithmeticException e) { 
		// 	// ERROR – unreachable code
		// 	System.out.println("This is never reached.");
		// }
	}
}
