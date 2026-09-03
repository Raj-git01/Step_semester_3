package oop.assigment_problems;

/** An employee record read straight after creation, with nothing assigned. */
class Employee {
    String empName;
    double salary;
    boolean permanent;
}

/**
 * Week 3 - Assignment Problem L3 : Reading Java's Default Field Values.
 * An unset boolean field is false, not true.
 */
public class EmployeeDefaults {

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Name: " + employee.empName);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Permanent: " + employee.permanent);
    }
}
