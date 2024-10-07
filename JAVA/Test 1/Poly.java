abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("showing method of B class");
    }
}

public class Poly {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}