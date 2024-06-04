
class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void displayPersonDetails() {
        System.out.println("Person Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    private double salary;

   
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    
    public void displayEmployeeDetails() {
        displayPersonDetails(); // Reusing the base class method
        System.out.println("Salary: $" + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", 30, 50000.0);
        employee.displayEmployeeDetails();
    }
}
OUTPUT
Person Name: GOUTHAM
Age: 20
Salary: $500000.0

=== Code Execution Successful ===
