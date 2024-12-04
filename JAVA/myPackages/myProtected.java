package myPackages;

class A {
    protected void show() {
        System.out.println("Learn coding..!");
    }
}

public class myProtected {
    public static void main(String[] args) {
        A r = new A();
        r.show();
    }
}