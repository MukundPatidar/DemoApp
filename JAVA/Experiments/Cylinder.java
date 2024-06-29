package Experiments;

// Cylinder.java
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(double radius, double height) {
        super(radius); 
        this.height = height;
    }
    
    public double volume() {
        return area() * height; 
    }
    
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        
        System.out.println("Radius: " + cylinder.radius);
        System.out.println("Height: " + cylinder.height);
        System.out.println("Area of base (Circle): " + cylinder.area());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}