package array.assigment_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Week 4 - Assignment A4 : Subarray Sum Equals K.
 * Prefix sums plus a frequency map. A sliding window fails here because negative
 * values mean the running sum is not monotonic, so shrinking the window is not safe.
 */
public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1);                 // the empty prefix, base case

        int runningSum = 0;
        int count = 0;

        for (int num : nums) {
            runningSum += num;
            // Every earlier prefix equal to (runningSum - k) closes a valid subarray here.
            count += prefixCounts.getOrDefault(runningSum - k, 0);
            prefixCounts.put(runningSum, prefixCounts.getOrDefault(runningSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] arrays = {{1, 1, 1}, {1, -1, 0}, {3, 4, 7, 2, -3, 1, 4, 2}};
        int[] targets = {2, 0, 7};

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(Arrays.toString(arrays[i]) + ", k = " + targets[i]
                    + " -> " + subarraySum(arrays[i], targets[i]));
        }
    }
}
