public class ExamScoreBandCounter {

    // First index where scores[i] >= target (returns length if none)
    static int lowerBound(int[] scores, int target) {
        int lo = 0, hi = scores.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (scores[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid; // keep searching left to reach the FIRST match
            }
        }
        return lo;
    }

    static int countInBand(int[] scores, int low, int high) {
        // first position >= low, first position > high (i.e. >= high + 1)
        return lowerBound(scores, high + 1) - lowerBound(scores, low);
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58));   // 6
        System.out.println(countInBand(scores, 90, 100));  // 0
    }
}

/*
 * Complexity:
 * Linear scan: O(n) time, O(1) space.
 * Final solution: O(log n) time (two binary searches), O(1) space.
 *
 * Duplicates: a standard binary search stops at ANY matching element,
 * which may be in the middle of a run of equal scores (e.g. the three 58s).
 * So the search must not stop on a match; it keeps moving left to find the
 * first index >= low and the first index > high, so every duplicate at
 * both edges of the band is counted exactly once.
 */
