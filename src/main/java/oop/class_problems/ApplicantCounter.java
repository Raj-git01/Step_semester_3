package oop.class_problems;

/** Every applicant shares one running count held in a static field. */
class Applicant {
    static int totalApplicants = 0;
    String name;

    public Applicant(String name) {
        this.name = name;
        totalApplicants++;
    }
}

/**
 * Week 3 - Class Problem L5 : Counting Objects With a Static Field.
 */
public class ApplicantCounter {

    public static void main(String[] args) {
        new Applicant("Divya");
        new Applicant("Karthik");
        new Applicant("Meera");

        System.out.println("Total applicants: " + Applicant.totalApplicants);
    }
}
