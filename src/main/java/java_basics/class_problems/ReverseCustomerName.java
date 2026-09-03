package java_basics.class_problems;

/**
 * Week 1 - Class Problem 5 : The Customer Identity Verification System.
 * Reverses a customer name without modifying the original value.
 */
public class ReverseCustomerName {

    /** Builds and returns the reverse of the given name. */
    public static String reverseCustomerName(String customerName) {
        char[] letters = customerName.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed.append(letters[i]);
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String[] customers = {"Sunil", "Ananya", "Rajkumar"};

        for (String name : customers) {
            System.out.println("Original Name: " + name);
            System.out.println("Reversed Name: " + reverseCustomerName(name));
            System.out.println();
        }
    }
}
