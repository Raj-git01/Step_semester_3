public class AttendanceTracker {

    // Returns {presentDays, longestStreak}
    static int[] attendanceSummary(int[] days) {
        int present = 0, current = 0, longest = 0;
        for (int d : days) {
            if (d == 1) {
                present++;
                current++;
                longest = Math.max(longest, current);
            } else {
                current = 0;
            }
        }
        return new int[]{present, longest};
    }

    public static void main(String[] args) {
        int[] s1 = attendanceSummary(new int[]{1, 1, 0, 1, 1, 1, 0, 1});
        System.out.println("Present: " + s1[0] + ", Longest streak: " + s1[1]);

        int[] s2 = attendanceSummary(new int[]{0, 0, 0});
        System.out.println("Present: " + s2[0] + ", Longest streak: " + s2[1]);
    }
}

/*
 * Complexity: O(n) time, O(1) extra space.
 * Yes, both answers are found in a single pass: the present count and the
 * running streak are updated together on every element.
 */
