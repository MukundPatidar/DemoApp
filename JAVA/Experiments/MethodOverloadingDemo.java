package Experiments;

public class MethodOverloadingDemo {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        System.out.println("Addition of two integers: " + demo.add(5, 3));
        System.out.println("Addition of three integers: " + demo.add(5, 3, 2));
        System.out.println("Concatenation of two strings: " + demo.add("Hello, ", "world!"));
    }
}