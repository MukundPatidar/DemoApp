import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int n = num1;
        int ans = 0;
        while(n > 0){
            int r = n%10;
            ans *= 10;
            ans += r;
            n /= 10;
        }
        System.out.println(num1);
        System.out.println(ans);
    }
}