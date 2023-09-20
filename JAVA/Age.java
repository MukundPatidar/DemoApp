import java.util.Scanner;

public class Age {

    public static void ag (int age) {
        if (age >= 18){
            System.out.println("You are eligible for vote.");
        } else if (age < 18) {
            System.out.println("You are not eligible for vote");
        }
    }
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("This function will help you to find you are eligible for vote.");

        System.out.print("Please enter your age : ");
        int age = sc.nextInt();

        ag(age);
        // Age exObj = new Age();
        // exObj.ag(age);
    }
    
}
