package Experiments;

public class Student {
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void displayStudentInfo(Student student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("Mukund", 18);
        displayStudentInfo(student1);
    }
}