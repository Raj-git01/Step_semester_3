package array.assigment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Week 4 - Assignment A3 : 3Sum.
 * Sort once, then a two-pointer scan per element, skipping duplicates at every level.
 */
public class ThreeSum {

    public static int[][] threeSum(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        List<int[]> triplets = new ArrayList<>();

        for (int i = 0; i < sorted.length - 2; i++) {
            if (i > 0 && sorted[i] == sorted[i - 1]) {
                continue;                       // skip a duplicate anchor value
            }

            int left = i + 1;
            int right = sorted.length - 1;

            while (left < right) {
                int sum = sorted[i] + sorted[left] + sorted[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    triplets.add(new int[]{sorted[i], sorted[left], sorted[right]});

                    // Move both pointers past their duplicate values.
                    while (left < right && sorted[left] == sorted[left + 1]) {
                        left++;
                    }
                    while (left < right && sorted[right] == sorted[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }

        return triplets.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] inputs = {
            {-1, 0, 1, 2, -1, -4},
            {0, 0, 0},
            {0, 1, 1}
        };

        for (int[] nums : inputs) {
            System.out.println(Arrays.toString(nums) + " -> " + Arrays.deepToString(threeSum(nums)));
        }
    }
}
