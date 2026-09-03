package string.class_problems;

/**
 * Week 2 - Class Problem 2 : CSV Student Record Parser.
 * Splits a registration line into its three fields and prints a formatted record.
 */
public class CsvStudentRecordParser {

    /** Parses "Name,RollNumber,Department" and prints it, or reports an invalid record. */
    public static void parseStudentRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        System.out.println("Name: " + fields[0].trim()
                + " | Roll No: " + fields[1].trim()
                + " | Dept: " + fields[2].trim());
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
        parseStudentRecord("Rahul Nair,RA2211003010456,ECE");
    }
}
