package Experiments;

public class Manipulate {
    public static void main (String args[]) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        System.out.println("Byte: "+ a);
        a++;
        System.out.println("Byte: "+ a);
        System.out.println("Short: "+ b);
        b++;
        System.out.println("Short: "+ b);
        System.out.println("Int: "+ c);
        c++;
        System.out.println("Int: "+ c);
        System.out.println("Long: "+ d);
        d++;
        System.out.println("Long: "+ d);
    }
}