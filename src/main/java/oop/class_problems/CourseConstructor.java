package oop.class_problems;

/** A course initialised through a constructor instead of two assignment lines. */
class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

/**
 * Week 3 - Class Problem L4 : Basic Constructor for a Course.
 */
public class CourseConstructor {

    public static void main(String[] args) {
        Course course = new Course("21CSC201J", "Data Structures");

        System.out.println(course.code + " - " + course.title);
    }
}
