package array.assigment_problems;

import java.util.Arrays;

/**
 * Week 4 - Assignment A2 : Maximum Subarray.
 * Kadane's algorithm - at each element, extend the running sum or restart from it.
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int bestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Extend the current run, or abandon it and start fresh here.
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }

    public static void main(String[] args) {
        int[][] inputs = {
            {-2, 1, -3, 4, -1, 2, 1, -5, 4},
            {-3, -1, -2},
            {5, 4, -1, 7, 8}
        };

        for (int[] nums : inputs) {
            System.out.println(Arrays.toString(nums) + " -> " + maxSubArray(nums));
        }
    }
}
