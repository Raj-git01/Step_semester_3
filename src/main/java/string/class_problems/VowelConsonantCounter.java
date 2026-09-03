package string.class_problems;

/**
 * Week 2 - Class Problem 1 : Library orientation kiosk text stats.
 * Counts vowels and consonants in a book title, ignoring spaces.
 */
public class VowelConsonantCounter {

    /** Prints the vowel and consonant totals for the given text. */
    public static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));

            if (ch < 'a' || ch > 'z') {
                continue;                      // spaces and anything non-alphabetic
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Java Programming");
        countVowelsAndConsonants("Effective Java");
    }
}
