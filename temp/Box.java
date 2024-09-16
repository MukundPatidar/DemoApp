// import java.util.*;

public class Box {
    double width;
    double hight;
    double depth;

    public static void print(double a,double b,double c){
        System.out.println(a*b*c);
    }
}

class Demo {
    public static void main(String[] args) {
        
        Box b1 = new Box();
        Box b2 = new Box();
        double vol;

        b1.depth = 10;
        b1.hight = 15;
        b1.width = 20;
        
        b2.depth = 5;
        b2.hight = 6;
        b2.width = 7;

        // vol = b1.depth * b1.hight * b1.width;
        // System.out.println("b1 volume = " + vol);
        // vol = b2.depth * b2.hight * b2.width;
        // System.out.println("b2 volume = " + vol);

        Box.print( b1.depth, b1.hight, b1.width);
        Box.print( b2.depth, b2.hight, b2.width);
    }
}