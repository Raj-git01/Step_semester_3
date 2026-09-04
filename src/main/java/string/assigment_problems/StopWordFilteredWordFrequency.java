import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StopWordFilteredWordFrequency {

    static final List<String> STOP_WORDS =
            Arrays.asList("the", "was", "and", "a", "is", "of", "in");

    static void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.toLowerCase()
                                  .replace(".", "")
                                  .replace(",", "");

        String[] words = cleaned.split("\\s+");

        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String word : words) {
            if (word.isEmpty() || STOP_WORDS.contains(word)) {
                continue;
            }
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort(Comparator.comparingInt((Map.Entry<String, Integer> e) -> e.getValue())
                                .reversed());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        printFilteredWordFrequency(
                "The mentor was great, the session was great and clear.");
        // great: 2
        // mentor: 1
        // session: 1
        // clear: 1
    }
}
