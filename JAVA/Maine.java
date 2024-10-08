interface A {
    void a1(); // public + abstract

    void a2(); // public + abstract

    default void a3() {
        System.out.println("May or May not Override in implementing classes");
    }
}

class B implements A {
    public void a1() {
        System.out.println("class B a1()");
    }

    public void a2() {
        System.out.println("class B a2()");
    }
}

class C implements A {
    public void a1() {
        System.out.println("class C a1()");
    }

    public void a2() {
        System.out.println("class C a2()");
    }
}

class D implements A {
    public void a1() {
        System.out.println("class D a1()");
    }

    public void a2() {
        System.out.println("class D a2()");
    }
}

public class Maine {
    public static void main(String[] args) {

    B b = new B();
    b.a1();
    b.a2();
    b.a3();

    C c = new C();
    c.a1();
    c.a2();
    c.a3();

    D d = new D();
    d.a1();
    d.a2();
    d.a3();
    }
}