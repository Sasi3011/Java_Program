public class Employee {

    private String name; // Private instance variable
    private int age;     // Private instance variable

    // Public getter method for name 
    public String getName() {
        return name;
    }

    // Public setter method for name with potential validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name provided.");
        }
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age with potential validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be a positive value.");
        }
    }

    // Constructor to print a message when an Employee object is created
    public Employee() {
        System.out.println("Employee class created with name and age properties.");
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Employee class created with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Raja", 30);
        Employee emp2 = new Employee("Kumar", 25);
    }
}