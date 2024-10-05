class outer{

    class inner{
        private int x = 10;

        int getX(){
            return x;
        }
    }

    public inner create(){
        return new inner();
    }

    void show(){
        inner obj = create();
        System.out.println("x is "+ obj.getX());
    }
}
public class NestedClass {
    public static void main(String[] args) {
        outer obj = new outer();

        obj.show();

    }
}
