public class SecondBestScore {

    // Returns the second-highest DISTINCT score, or -1 if it does not exist
    static int secondHighest(int[] scores) {
        int highest = -1, second = -1;   // scores are 0..100, so -1 means "none yet"
        for (int s : scores) {
            if (s > highest) {
                second = highest;        // old highest becomes second
                highest = s;
            } else if (s < highest && s > second) {
                second = s;              // skips scores equal to highest
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondHighest(new int[]{45, 78, 92, 78, 60})); // 78
        System.out.println(secondHighest(new int[]{50, 50, 50}));         // -1
    }
}

/*
 * Complexity:
 * Time: O(n), each score is visited exactly once.
 * Space: O(1), only two variables are used.
 *
 * Compared with sorting first:
 * Sorting takes O(n log n) time, and then you still have to walk back past
 * duplicates of the highest score to find the second distinct one. It also
 * either changes the original array or needs an O(n) copy. The single-pass
 * approach is faster and uses no extra memory, and it follows the
 * "do not sort the array" constraint.
 */
