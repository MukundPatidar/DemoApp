package Experiments;

// Employee.java
public class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}