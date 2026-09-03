package oop.class_problems;

/** A student's name and marks held together in one object instead of two loose variables. */
class Student {
    String name;
    int marks;
}

/**
 * Week 3 - Class Problem L1 : Simple Student Record Class.
 */
public class StudentRecord {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Divya";
        student.marks = 88;

        System.out.println("Name: " + student.name + " | Marks: " + student.marks);
    }
}
