import java.util.Scanner;

public class Emp {
    private String name;
    private int age;
    private int empId;
    private String department;
    private double salary;

    public Emp(int id, String name, int age, String department, double salary) {
        this.empId = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter Department: ");
        String department = scanner.next();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        
        Emp employee = new Emp(id, name, age, department, salary);
        employee.displayInfo();
        
        scanner.close();
    }
}
