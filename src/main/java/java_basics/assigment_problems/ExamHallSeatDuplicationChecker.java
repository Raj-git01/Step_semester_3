package java_basics.assigment_problems;

/**
 * Week 1 - Assignment Problem 1 : The Exam Hall Seat Duplication Checker.
 * Arrays and loops only - no Collections classes are used anywhere.
 */
public class ExamHallSeatDuplicationChecker {

    /** Reports every seat number assigned to more than one student. */
    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            // Skip this seat if an earlier position already reported the same number.
            boolean alreadyReported = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyReported = true;
                    break;
                }
            }
            if (alreadyReported) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] hallOne = {101, 102, 103, 102, 105};
        int[] hallTwo = {101, 102, 103, 104, 105};
        int[] hallThree = {201, 202, 201, 203, 202};

        System.out.println("Hall 1:");
        checkDuplicateSeats(hallOne);

        System.out.println("\nHall 2:");
        checkDuplicateSeats(hallTwo);

        System.out.println("\nHall 3:");
        checkDuplicateSeats(hallThree);
    }
}
