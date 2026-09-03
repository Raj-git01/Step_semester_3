package string.class_problems;

/**
 * Week 2 - Class Problem 4 : Masked Phone Number Formatter.
 * Hides the first six digits of a 10-digit number and keeps the last four visible.
 */
public class MaskedPhoneNumberFormatter {

    /** Returns the masked form "XXXXXX-1234", or an error message when validation fails. */
    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        StringBuilder masked = new StringBuilder("XXXXXX");
        masked.append(phone.substring(6));
        masked.insert(6, '-');                 // separator between mask and last 4 digits

        return masked.toString();
    }

    public static void main(String[] args) {
        String[] numbers = {"9876543210", "98765", "98765abcde"};

        for (String phone : numbers) {
            System.out.println(phone + " -> " + maskPhoneNumber(phone));
        }
    }
}
