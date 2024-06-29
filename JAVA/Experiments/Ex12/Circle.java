package Experiments.Ex12;

// Circle.java (subclass of Shape)
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}