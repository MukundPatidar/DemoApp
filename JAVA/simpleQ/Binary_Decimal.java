package simpleQ;
import java.util.*;

public class Binary_Decimal {

    public static void Decimal_to_Binary(int Decimal) {
        int Binary[] = new int[1000];
        int i = 0;
        int n = Decimal;
        
        while (Decimal > 0) {
            Binary[i] = Decimal % 2;
            Decimal /= 2;
            i++;
        }

        System.out.print(n+" in Binary is: ");
        for(int j = i-1; j >= 0; j--) {
            System.out.print(Binary[j]);
        }
    }

    public static void Binary_to_Decimal(int Binary) {
        int Decimal = 0;
 
        int base = 1;
 
        int temp = Binary;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            Decimal += last_digit * base;
 
            base = base * 2;
        }

        System.out.println(Binary+" in Decimal is: "+Decimal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       boolean status = true;
       byte a;
       int Decimal, Binary;

        do {
            System.out.println("Enter what function you want.");
            System.out.println("1. Decimal to Binary.");
            System.out.println("2. Binary to Decimal.");
            System.out.print("(1/2): ");
            a = sc.nextByte();

            if(a == 1) {
                System.out.print("Enter Decimal value: ");
                Decimal = sc.nextInt();
                Decimal_to_Binary(Decimal);
            } 
            else if(a == 2) {
                System.out.print("Enter Binary value: ");
                Binary = sc.nextInt();
                Binary_to_Decimal(Binary);
            } 
            else {
                System.out.println("Invalid input please try again.");
                status = false;
            }

        } while (status == false);

        sc.close();
    }
}
