import java.util.*;
class Calculator {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int dif = a - b;
            int mul = a * b;
            int div = a / b;
            int rem = a % b;
            int n = sc.nextInt();
            switch(n){
                case 1 : System.out.println(sum);
                break;
                case 2 : System.out.println(dif);
                break;
                case 3 : System.out.println(mul);
                break;
                case 4 : System.out.println(div);
                break;
                case 5 : System.out.println(rem);
            }

        }
    }
}