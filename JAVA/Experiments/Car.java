package Experiments;

// Car.java (class implementing Vehicle interface)
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        
        car.start();
        car.stop();
    }
}