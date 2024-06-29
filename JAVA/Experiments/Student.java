package Experiments;

// Student.java
public class Student extends Person {
    private int studentId;
    
    public Student(String name, int age, int studentId) {
        super(name, age); 
        this.studentId = studentId;
    }
    
    public void displayStudentDetails() {
        super.displayDetails(); 
        System.out.println("Student ID: " + studentId);
    }
    
    public static void main(String[] args) {
        Student student = new Student("Mukund Patidar", 18, 26988);
        student.displayStudentDetails();
    }
}