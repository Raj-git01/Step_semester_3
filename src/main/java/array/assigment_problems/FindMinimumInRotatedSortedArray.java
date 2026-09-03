package array.assigment_problems;

import java.util.Arrays;

/**
 * Week 4 - Assignment A5 : Find Minimum in Rotated Sorted Array.
 * Modified binary search comparing the middle element to the rightmost one - O(log n).
 */
public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;                  // the rotation point sits to the right
            } else {
                high = mid;                     // mid could itself be the minimum
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[][] inputs = {
            {3, 4, 5, 1, 2},
            {4, 5, 6, 7, 0, 1, 2},
            {11, 13, 15, 17}
        };

        for (int[] nums : inputs) {
            System.out.println(Arrays.toString(nums) + " -> " + findMin(nums));
        }
    }
}
