class A{
    double r;
    A(double redius){
           r = redius;
    }

    double area(){
        return 3.14 * r * r;
    }
}

class Temp {
    public static void main(String[] args) {
        A obj = new A(10.58);
        System.out.println(obj.area());
    }
}