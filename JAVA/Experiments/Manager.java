package Experiments;

// Manager.java
public class Manager extends Employee {
    private String department;
    
    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }
    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Manager Department: " + department);
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager("Mukund Patidar", 75000.0, "Software");
        manager.displayDetails();
    }
}