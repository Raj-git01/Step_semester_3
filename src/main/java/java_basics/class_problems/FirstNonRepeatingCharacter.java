package java_basics.class_problems;

/**
 * Week 1 - Class Problem 4 : The Unique Letter Hunt Mini-Game.
 * Finds the first character in a text that appears exactly once.
 */
public class FirstNonRepeatingCharacter {

    /** Returns the first non-repeating character, or '\0' when every character repeats. */
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);        // early exit on the first unique one
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc", "unique letter hunt"};

        for (String text : inputs) {
            char result = findFirstNonRepeatingChar(text);
            if (result == '\0') {
                System.out.printf("\"%s\" -> No Non-Repeating Character Found%n", text);
            } else {
                System.out.printf("\"%s\" -> First Non-Repeating Character: '%c'%n", text, result);
            }
        }
    }
}
