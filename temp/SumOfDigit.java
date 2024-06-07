import java.util.*;
public class SumOfDigit {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Digit : ");
int number = sc.nextInt();
sc.close();
int sum = 0;
while (number != 0) {
int digit = number % 10;
sum += digit;
number /= 10;
}
System.out.println("Sum of Digit is : "+sum);
}
}