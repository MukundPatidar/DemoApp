class A{
    private double r;

    A(){
        r = 0.0;
    }

    A(double redius){
        this.r = redius;
    }

    double area(){
        return 3.14 * r * r;
    }
}

class constru {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(2);

        print(obj);
        print(obj1);
    }

    public static void print(A obj){
        System.out.println(obj.area());
    } 
}