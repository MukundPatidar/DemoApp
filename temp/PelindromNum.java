import java.util.Scanner;

public class PelindromNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 0;
        int n = num1;

        while( n > 0){
            int temp = n % 10;
            num2 *= 10;
            num2 += temp;
            n /= 10;
        }

        if(num1 == num2){
            System.out.println(num1 + " is palindrom number.");
        } else {
            System.out.println(num1 + " is not palindrom number.");
        }
    }
}
