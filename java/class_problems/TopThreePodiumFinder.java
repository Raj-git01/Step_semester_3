import java.util.Arrays;

/**
 * PROBLEM 3 - Top-3 Podium Finder
 * One pass, O(n) time, O(1) space. No sort.
 *
 * The cascade order matters: shift THIRD before SECOND before FIRST,
 * otherwise you overwrite a value you still need.
 *
 * Ties: comparison is strictly '>' at the top level, so a repeated 90 falls
 * through to the 'second' branch and legitimately occupies second place.
 */
public class TopThreePodiumFinder {

    static int[] findTopThreeScores(int[] scores) {
        long first  = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third  = Long.MIN_VALUE;

        for (int s : scores) {
            if (s > first) {
                third  = second;
                second = first;
                first  = s;
            } else if (s > second) {
                third  = second;
                second = s;
            } else if (s > third) {
                third  = s;
            }
        }
        return new int[]{(int) first, (int) second, (int) third};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                findTopThreeScores(new int[]{45, 82, 79, 90, 33, 90, 61})));
        // [90, 90, 82]

        System.out.println(Arrays.toString(
                findTopThreeScores(new int[]{5, 5, 5})));
        // [5, 5, 5]

        System.out.println(Arrays.toString(
                findTopThreeScores(new int[]{1, 2, 3, 4, 5, 6})));
        // [6, 5, 4]

        System.out.println(Arrays.toString(
                findTopThreeScores(new int[]{100, 99, 98, 1, 2})));
        // [100, 99, 98]
    }
}
