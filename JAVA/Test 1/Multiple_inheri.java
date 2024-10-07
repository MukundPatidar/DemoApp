interface A {
    void show();
}

interface B {
    void show();       
}

class Multiple implements A, B {
    public void show() {
        System.out.println("Interface A & B");
    }
}

public class Multiple_inheri {
    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.show();
    }
}