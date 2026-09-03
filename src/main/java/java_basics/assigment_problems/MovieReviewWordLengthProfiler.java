package java_basics.assigment_problems;

/**
 * Week 1 - Assignment Problem 5 : The Movie Review Word Length Profiler.
 * Buckets every word of a review into Short, Medium or Long.
 */
public class MovieReviewWordLengthProfiler {

    /** Counts how many words of each length band the review contains. */
    public static void classifyWordLengths(String review) {
        String[] words = review.trim().split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            int letters = countLetters(word);
            if (letters == 0) {
                continue;                     // stray punctuation, not a real word
            }
            if (letters <= 4) {
                shortWords++;
            } else if (letters <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortWords, mediumWords, longWords);
    }

    /** Counts only the alphabetic characters so punctuation does not inflate the length. */
    private static int countLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
        classifyWordLengths("Bad plot, weak acting, unbelievably disappointing screenplay");
    }
}
