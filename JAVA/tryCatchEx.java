public class tryCatchEx {
    public static void main(String args[]) {
        int d, a;
        try {
            d = 0;
            a = 10 / d;
            System.out.println(a);
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero. Arithmetic Exception");
        }
        System.out.println("After catch statement.");
    }

}