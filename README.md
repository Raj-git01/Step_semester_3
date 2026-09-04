# Session 4 — Functions & Arrays

**Branch:** `feature/session_4` · **Topic package:** `array`

Week 4 of STEP Semester 3. Both the live-session sheet and the Category C assignment are
complete — 10 problems, plain JDK, no external dependencies.

## Structure

```
src/main/java/array/
  class_problems/         <- live-session problems
  assigment_problems/     <- Category C assignment (LeetCode practice)
```

## Class Problems (live session)

| # | Problem | File | Approach | Complexity |
|---|---------|------|----------|------------|
| 1 | Two Sum | `class_problems/TwoSum.java` | Nested scan over every pair | O(n²) time, O(1) space |
| 2 | Contains Duplicate | `class_problems/ContainsDuplicate.java` | Nested pair comparison | O(n²) time, O(1) space |
| 3 | Merge Sorted Arrays | `class_problems/MergeSortedArrays.java` | Two pointers, then drain the tail | O(n + m) time |
| 4 | Rotate Array | `class_problems/RotateArray.java` | Index remap `(i + k) % n` into a new array | O(n) time, O(n) space |
| 5 | Best Time to Buy and Sell Stock | `class_problems/BestTimeToBuySellStock.java` | Single pass tracking min-so-far | O(n) time, O(1) space |

## Assignment Problems (Category C)

| # | Problem | File | Target complexity |
|---|---------|------|-------------------|
| A1 | Product of Array Except Self | `assigment_problems/ProductOfArrayExceptSelf.java` | O(n) time, O(1) extra space, no division |
| A2 | Maximum Subarray | `assigment_problems/MaximumSubarray.java` | O(n) time, O(1) space (Kadane's) |
| A3 | 3Sum | `assigment_problems/ThreeSum.java` | O(n²) time (sort + two pointers) |
| A4 | Subarray Sum Equals K | `assigment_problems/SubarraySumEqualsK.java` | O(n) time, O(n) space (prefix sums + hash map) |
| A5 | Find Minimum in Rotated Sorted Array | `assigment_problems/FindMinimumInRotatedSortedArray.java` | O(log n) time (modified binary search) |

## Notes on the tricky bits

### Class problems

- **Rotate Array** computes `k = k % n` first. Without it, a `k` larger than the array
  length walks past the end and throws `ArrayIndexOutOfBoundsException`. Writing each
  element straight to its destination index is O(n); shifting by one position `k` times is
  O(n·k) and is the version to avoid.
- **Best Time to Buy and Sell Stock** compares today's price against the minimum seen so
  far *before* updating that minimum, which is what stops a buy and a sell landing on the
  same day. Profit is seeded at `0`, so a strictly falling price series returns `0` rather
  than a negative number.
- **Merge Sorted Arrays** drains both remainders after the main loop. Only one of the two
  trailing `while` loops ever runs, but omitting either silently truncates the output.

### Assignment problems

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

## Concepts covered

Array declaration and traversal, nested loops, two-pointer scanning, prefix and suffix
passes, modular index arithmetic, running-minimum and running-sum state, Kadane's
algorithm, binary search on a rotated array, `HashMap` prefix-sum counting with
`getOrDefault()`, `Arrays.sort()`, `Arrays.toString()`, and static helper methods with
array parameters and return values.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out array.assigment_problems.ProductOfArrayExceptSelf
java -cp out array.assigment_problems.ThreeSum
```

Every class has its own `main`, so each problem runs standalone.

## Known gaps

- The five files in `class_problems` have **no `package` declaration**, so they sit in the
  default package while `assigment_problems` is packaged as `array.assigment_problems`.
  IntelliJ runs them anyway, but `java -cp out array.class_problems.TwoSum` will not
  resolve. Add `package array.class_problems;` to the top of each file.
- This branch is missing `src/main/resources/.gitkeep`, which every other branch has.
- Two Sum and Contains Duplicate are the O(n²) versions the live session asked for. The
  `HashMap` / `HashSet` O(n) versions are the ones interviews expect — worth adding
  alongside rather than replacing, since the brute-force baseline is what the comparison
  is against.
- The divide-and-conquer O(n log n) alternative to Kadane's is still to be revised; it is a
  common interview follow-up to A2.
