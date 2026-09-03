package array.assigment_problems;

import java.util.Arrays;

/**
 * Week 4 - Assignment A1 : Product of Array Except Self.
 * Two passes, no division anywhere - O(n) time, O(1) extra space beyond the output array.
 */
public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: answer[i] holds the product of everything to the LEFT of i.
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Backward pass: multiply in the product of everything to the RIGHT of i.
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] inputs = {
            {1, 2, 3, 4},
            {-1, 1, 0, -3, 3},
            {2, 3}
        };

        for (int[] nums : inputs) {
            System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(productExceptSelf(nums)));
        }
    }
}
