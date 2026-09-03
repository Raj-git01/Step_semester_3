package java_basics.assigment_problems;

/**
 * Week 1 - Assignment Problem 3 : The Traffic Signal Streak Analyzer.
 * Finds the longest run of one colour in a minute-by-minute signal log.
 */
public class TrafficSignalStreakAnalyzer {

    /** Prints the colour and the length of the longest continuous streak. */
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Empty signal log - nothing to analyze");
            return;
        }

        char bestColour = signalLog.charAt(0);
        int bestLength = 1;

        char currentColour = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColour) {
                currentLength++;
            } else {
                currentColour = signalLog.charAt(i);
                currentLength = 1;
            }

            if (currentLength > bestLength) {     // running maximum
                bestLength = currentLength;
                bestColour = currentColour;
            }
        }

        System.out.printf("Longest Streak: '%c' repeated %d times%n", bestColour, bestLength);
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
        findLongestStreak("RYGRYGRYG");
    }
}
