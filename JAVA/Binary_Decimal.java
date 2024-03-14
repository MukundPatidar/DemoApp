import java.util.Scanner;

public class Binary_Decimal {

    public static void Decimal_to_Binary(int Decimal) {
        
        int[] binaryNum = new int[1000]; 
        
        int i = 0; 
        while (Decimal > 0) { 
            binaryNum[i] = Decimal % 2; 
            Decimal = Decimal / 2; 
            i++; 
        } 
    
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    }

    public static void Binary_to_Decimal() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal;

        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("1/2 : ");
        int a = sc.nextInt();
        
        if( a == 1 ) {
            Binary_to_Decimal();
        } else if( a == 2 ) {
            System.out.print("Enter Decimal value : ");
            Decimal = sc.nextInt();
            Decimal_to_Binary(Decimal);
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
