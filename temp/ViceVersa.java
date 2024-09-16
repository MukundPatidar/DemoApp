import java.util.Scanner;

public class ViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'y';
        ch = Character.toUpperCase(ch);
        
        System.out.println(ch);
        
        ch = Character.toLowerCase(ch);
        System.out.println(ch);
        
        String str = "mukun patidar";
        ch = Character.toUpperCase(str.charAt(0));
        System.out.println(ch);
    }
}   