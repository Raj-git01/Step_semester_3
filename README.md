# Session 4 — Functions & Arrays

**Branch:** `feature/session_4` · **Topic package:** `array`

## Structure

```
src/main/java/array/
  class_problems/         <- live-session problems (sheet not released yet)
  assigment_problems/     <- Category C assignment (LeetCode practice)
```

## Assignment Problems

| # | Problem | File | Target complexity |
|---|---------|------|-------------------|
| A1 | Product of Array Except Self | `assigment_problems/ProductOfArrayExceptSelf.java` | O(n) time, O(1) extra space, no division |
| A2 | Maximum Subarray | `assigment_problems/MaximumSubarray.java` | O(n) time, O(1) space (Kadane's) |
| A3 | 3Sum | `assigment_problems/ThreeSum.java` | O(n²) time (sort + two pointers) |
| A4 | Subarray Sum Equals K | `assigment_problems/SubarraySumEqualsK.java` | O(n) time, O(n) space (prefix sums + hash map) |
| A5 | Find Minimum in Rotated Sorted Array | `assigment_problems/FindMinimumInRotatedSortedArray.java` | O(log n) time (modified binary search) |

## Notes on the tricky bits

- **A1** never divides, so a zero anywhere in the array is handled correctly by the two
  prefix/suffix passes rather than by a special case.
- **A2** seeds both `currentSum` and `bestSum` with `nums[0]`, so an all-negative array
  correctly returns its single largest value instead of `0`.
- **A3** skips duplicates at three separate points — the anchor element, the left pointer
  and the right pointer — which is where this problem usually breaks.
- **A4** cannot use a sliding window: with negative numbers the running sum is not
  monotonic, so growing or shrinking the window no longer moves the sum predictably. The
  prefix-sum map is seeded with `{0: 1}` for the empty prefix.
- **A5** compares `nums[mid]` against `nums[high]` (not `nums[low]`), which handles the
  already-sorted, never-rotated array without a special case.

## Class Problems

The Week 4 live-session sheet has not been released on Google Classroom yet. The
`class_problems` package is in place and will be filled in on this same branch.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out array.assigment_problems.ProductOfArrayExceptSelf
java -cp out array.assigment_problems.ThreeSum
```

Every class has its own `main`, so each problem runs standalone.
