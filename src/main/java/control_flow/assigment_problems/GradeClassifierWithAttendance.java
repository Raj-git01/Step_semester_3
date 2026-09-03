package control_flow.assigment_problems;

/**
 * Level 2 - P1 : Grade Classifier With Logical Operators.
 * Attendance and marks are checked together with && before any grade is awarded.
 */
public class GradeClassifierWithAttendance {

    public static void classifyWithAttendance(int marks, int attendance) {
        boolean eligible = attendance >= 75 && marks >= 40;

        if (!eligible) {
            System.out.println("Detained");
            return;
        }

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String[] args) {
        classifyWithAttendance(82, 80);
        classifyWithAttendance(91, 60);
        classifyWithAttendance(95, 90);
        classifyWithAttendance(35, 95);
    }
}
