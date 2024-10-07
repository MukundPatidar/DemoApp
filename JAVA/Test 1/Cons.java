// Constructor Overloading

class A {
    A() {
        System.out.println("without perameter");
    }

    A(int a, int b) {
        System.out.println("Two int parameter");
    }

    A(int a, int b, int c){
        System.out.println("Three int parameter");
    }
}

public class Cons {
    A a1 = new A();
    A a2 = new A(10,20);
    A a3 = new A(10,20,30);
}
