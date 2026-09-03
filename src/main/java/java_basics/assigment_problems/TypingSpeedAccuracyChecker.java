package java_basics.assigment_problems;

/**
 * Week 1 - Assignment Problem 2 : The Typing Speed Test Accuracy Checker.
 * Compares a typed attempt with the original passage character by character.
 */
public class TypingSpeedAccuracyChecker {

    /** Prints match count, accuracy percentage and the first mismatch position. */
    public static void checkTypingAccuracy(String original, String typed) {
        if (original.length() != typed.length()) {
            System.out.println("Invalid input: both texts must have the same length");
            return;
        }

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;                 // remember only the very first slip
            }
        }

        double accuracy = (matched * 100.0) / original.length();

        if (firstMismatch == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, original.length(), accuracy);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, original.length(), accuracy,
                    firstMismatch + 1, original.charAt(firstMismatch), typed.charAt(firstMismatch));
        }
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
        checkTypingAccuracy("java practice", "jrva practice");
    }
}
