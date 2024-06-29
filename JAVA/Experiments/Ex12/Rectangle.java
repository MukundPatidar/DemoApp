package Experiments.Ex12;

// Rectangle.java (subclass of Shape)
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}