import java.util.*;
import java.util.function.Function;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;

   
public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

public String getFName() {
        return firstName;
    }

public String getLName() {
        return lastName;
    }

public double getSalary() {
        return salary;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Azer", "Aliyev", 5000));
        employees.add(new Employee("Ayan", "Maharramova", 6200));
        employees.add(new Employee("Jack", "Champion", 6000));

Function<Employee, String> formatCard = e -> "Name: " + e.getLName() + ", " + e.getFName() + " - Salary:" + e.getSalary();

        
Function<Employee, Double> salaryPicker = Employee::getSalary;

for (Employee e : employees) {
    System.out.println(formatCard.apply(e));
    System.out.println("Salary only: $" + salaryPicker.apply(e));
    System.out.println();
        }
    }


    
}