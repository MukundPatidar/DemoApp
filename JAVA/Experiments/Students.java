package Experiments;

public class Students {
    private String name;
    private int age;
    
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void displayStudentInfo(Students student) {
        System.out.println("Students Name: " + student.name);
        System.out.println("Students Age: " + student.age);
    }
    
    public static void main(String[] args) {
        Students student1 = new Students("Mukund", 18);
        displayStudentInfo(student1);
    }
}