package java_basics.class_problems;

/**
 * Week 1 - Class Problem 2 : The QA Text Verification Toolkit.
 * Verifies a palindrome with three independent approaches so all three can be compared.
 */
public class PalindromeChecker {

    /** Approach 1 : compare characters from both ends moving inward. */
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /** Approach 2 : recursion, shrinking the substring on every call. */
    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    /** Approach 3 : reverse a character array and compare it with the original. */
    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    private static String label(boolean isPalindrome) {
        return isPalindrome ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        String[] inputs = {"madam", "hello", "racecar"};
        for (String text : inputs) {
            System.out.printf("\"%s\" -> Iterative: %s | Recursive: %s | Array Reversal: %s%n",
                    text,
                    label(isPalindromeIterative(text)),
                    label(isPalindromeRecursive(text)),
                    label(isPalindromeArrayReversal(text)));
        }
    }
}
