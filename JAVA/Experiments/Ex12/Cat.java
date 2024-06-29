package Experiments.Ex12;

// Cat.java (class implementing Animal interface)
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}