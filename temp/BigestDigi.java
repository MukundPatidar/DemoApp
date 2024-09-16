import java.util.Scanner;

public class BigestDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 0;
        int n = num1;

        while( n > 0){
            int temp = n % 10;
            n /= 10;
            if(temp > num2){
                num2 = temp;
            }
        }

        System.out.println("Biggest value is = " + num2);
    }
}
