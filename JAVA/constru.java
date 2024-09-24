class A {
    int a;
    String b;
   
    A(){
        a = 22;
        b = "Mukund";
        System.out.println(a+" "+b);
    }
    
    A(A ref){
        int a = ++ref.a;
        String b = ref.b;
        System.out.println(a+" "+b);
    }
}

public class constru {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(r);
    }
}