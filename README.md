# Step Semester 3 — SRM

STEP Semester 3 coursework. All solutions are written in **Java**.

This branch (`main`) holds documentation only — the daily log below. No code lives here.
Code lives on the session branches.

## Branch index

| Branch | Contents | Topic package |
|--------|----------|---------------|
| `main` | This README — daily progress log | — |
| `develop` | Empty Java project skeleton | — |
| [`feature/session_1`](../../tree/feature/session_1) | Week 1 — Java fundamentals | `java_basics` |
| [`feature/session_2`](../../tree/feature/session_2) | Week 2 — Strings | `string` |
| [`feature/session_3`](../../tree/feature/session_3) | Week 3 — OOP + control flow | `oop`, `control_flow` |
| [`feature/session_4`](../../tree/feature/session_4) | Week 4 — Functions & arrays | `array` |

Every session branch is created from `develop`. Feature branches are kept separate and are
never merged back, so `develop` stays a clean, empty base project all semester.

Inside each session branch the layout is:

```
src/main/java/<topic>/
  class_problems/         <- problems solved during the live session
  assigment_problems/     <- problems given as take-home assignments
```

## Progress log

## Date: 02-09-2026

**Today's Work:**
- Week 4 (Functions & Arrays) Category C assignment — all 5 LeetCode-style problems solved
  on `feature/session_4` in the `array` topic package.
- Product of Array Except Self using two prefix/suffix passes with no division anywhere,
  so zero-valued entries need no special case.
- Maximum Subarray with Kadane's algorithm, seeded so an all-negative array returns its
  largest single element rather than 0.
- 3Sum with sort plus two pointers, skipping duplicates at the anchor and at both pointers.
- Subarray Sum Equals K with prefix sums in a HashMap, seeded with the empty prefix.
- Find Minimum in Rotated Sorted Array with a modified binary search comparing mid against
  the rightmost element.

**Next Session Plan:**
- Add the Week 4 live-session problems to `array/class_problems` once the sheet is released.
- Revise the divide-and-conquer O(n log n) alternative to Kadane's, since it is a common
  interview follow-up.

**Issues Faced:**
- 3Sum initially reported `[-1, -1, 2]` twice on inputs with repeated values. Fixed by
  skipping duplicates at three separate points instead of only at the anchor element.
- Spent time working out why a sliding window cannot solve Subarray Sum Equals K —
  negative numbers make the running sum non-monotonic, so the window cannot be shrunk
  safely. Prefix sums are the right tool.

---

## Date: 26-08-2026

**Today's Work:**
- Week 3 covered two sheets, so `feature/session_3` carries two topic packages.
- `oop` — 5 live-session problems (Student, HostelRoom, LibraryCard, Course, Applicant) and
  5 homework problems (Book, ExamHall, Employee, Product, Order): class definitions, object
  creation, independent instance state, default field values, constructors, static counters.
- `control_flow` — the Category C assignment asked for any five; solved all fifteen across
  Levels 1 to 3, covering if/else ladders, switch with break and default, for and while
  loops, break/continue, nested loops and boolean flags.

**Next Session Plan:**
- Start Week 4 on functions and arrays.

**Issues Faced:**
- Was expecting `null` and `""` to print the same way for an unset String field. Printing
  the fields straight after `new` settled it — an unset object reference really is `null`.
- Had to re-check that `case` labels without `break` fall through into the next case.

---

## Date: 19-08-2026

**Today's Work:**
- Week 2 (Strings) live-session problems solved on `feature/session_2` in the `string`
  package: vowel/consonant counter, CSV record parser, file extension validator, masked
  phone number formatter, and the bank transaction reference normalizer + validator.
- Practised `charAt()`, `split()`, `lastIndexOf()`, `substring()`, `equalsIgnoreCase()`,
  `trim()`, `StringBuilder.insert()`, and `Character.isLetter()` / `isDigit()`.

**Next Session Plan:**
- Week 3 on classes and objects.
- Fill in `string/assigment_problems` once the Week 2 assignment sheet is released.

**Issues Faced:**
- The transaction reference validator needed the reason for failure, not just true/false,
  so the checks had to be split into ordered stages: length, then bank code, then body.

---

## Date: 12-08-2026

**Today's Work:**
- Repository set up following the STEP GitHub Structure Guide: `main` for documentation,
  `develop` for the empty project skeleton, and `feature/session_n` branches per session.
- Week 1 live-session problems solved on `feature/session_1` in the `java_basics` package:
  Rock-Paper-Scissors simulator, palindrome checker in three approaches (iterative,
  recursive, array reversal), team BMI report, first non-repeating character, and customer
  name reversal.
- Week 1 assignment problems solved in the same branch: seat duplication checker, typing
  accuracy checker, traffic signal streak analyzer, warehouse inventory balancer, and movie
  review word length profiler.

**Next Session Plan:**
- Week 2 on string methods.

**Issues Faced:**
- The seat duplication checker had to work with arrays and nested loops only — no
  Collections class. It printed the same duplicate twice until a check was added to skip
  numbers that an earlier position had already reported.
- The first non-repeating character needed a two-pass scan: count every character first,
  then walk the string again to find the first one with a frequency of exactly 1.

---
