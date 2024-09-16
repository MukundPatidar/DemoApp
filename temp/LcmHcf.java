import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, greatest, lcm=0, hcf;

        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();

        if(a > b){
            greatest = a;
        } else {
            greatest = b;
        }

        for(int i=greatest; i<=(a*b); i++){
            if((i%a == 0) && (i%b == 0)){
                lcm = i;
                break;
            }
        }

        hcf = (a*b)/lcm;
        System.out.println("LCM is = " + lcm);
        System.out.println("HCF is = " + hcf);
    }
}
