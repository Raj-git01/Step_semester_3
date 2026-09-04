# Step Semester 3 — SRM

STEP Semester 3 coursework. All solutions are written in **Java**, plain JDK, no build tool
and no external dependencies.

This branch (`main`) holds documentation only — the branch index and the daily log below.
No code lives here. Code lives on the session branches.

## Branching model

```
main                 documentation only (this README)
└── develop          empty Java project skeleton — never receives merges
    ├── feature/session_1
    ├── feature/session_2
    ├── feature/session_3
    └── feature/session_4
```

Every session branch is cut from `develop`. Feature branches are kept separate and are
**never merged back**, so `develop` stays a clean, empty base project all semester and each
session branch is a self-contained snapshot of one week's work.

## Branch index

| Branch | Week / topic | Topic package | Class problems | Assignment problems |
|---|---|---|---|---|
| `main` | Documentation + progress log | — | — | — |
| `develop` | Empty Java project skeleton | — | — | — |
| [`feature/session_1`](https://github.com/Raj-git01/Step_semester_3/tree/feature/session_1) | Week 1 — Java fundamentals | `java_basics` | 5 | 5 |
| [`feature/session_2`](https://github.com/Raj-git01/Step_semester_3/tree/feature/session_2) | Week 2 — Strings | `string` | 5 | 5 |
| [`feature/session_3`](https://github.com/Raj-git01/Step_semester_3/tree/feature/session_3) | Week 3 — OOP (+ control flow, currently deleted) | `oop` | 5 | 5 |
| [`feature/session_4`](https://github.com/Raj-git01/Step_semester_3/tree/feature/session_4) | Week 4 — Functions & arrays | `array` | 5 | 5 |

**40 Java files currently on the branch tips** (50 solved — the 15 `control_flow` files are
solved but were deleted from `feature/session_3` by commit `9b4bfdd`; see Known gaps).
Each session branch carries its own detailed README with a per-problem table.

## Repository layout

Inside each session branch:

```
src/main/java/<topic>/
  class_problems/         <- problems solved during the live session
  assigment_problems/     <- problems given as take-home assignments
src/main/resources/
Step_semester_3.iml       <- IntelliJ module: src/main/java is the source root
.gitignore                <- *.class, out/, target/, build/, bin/, .idea/, OS files
```

Note the folder name `assigment_problems` is spelled that way across every branch. It is
consistent, so leave it alone unless every branch is renamed at once.

## How to run

Every class has its own `main`, so each problem runs standalone.

```bash
git checkout feature/session_4
javac -d out $(find src/main/java -name '*.java')
java -cp out array.assigment_problems.MaximumSubarray
```

## Contents by session

### Session 1 — Java fundamentals (`java_basics`)

| Type | Problems |
|---|---|
| Class | Rock-Paper-Scissors simulator, palindrome checker (iterative / recursive / array reversal), team BMI report, first non-repeating character, customer name reversal |
| Assignment | Exam hall seat duplication checker, typing speed accuracy checker, traffic signal streak analyzer, warehouse inventory balancer, movie review word length profiler |

Variables and types, operators, `Math.random()`, `Scanner` input, arrays, nested loops,
recursion, two-pass frequency counting.

### Session 2 — Strings (`string`)

| Type | Problems |
|---|---|
| Class | Vowel/consonant counter, CSV student record parser, file extension validator, masked phone number formatter, bank transaction reference normalizer + validator |
| Assignment | ATM PIN length validator, library ISBN normalizer + validator, product inventory CSV parser, stop-word filtered word frequency, word reversal encoder |

`charAt()`, `split()`, `substring()`, `lastIndexOf()`, `trim()`, `toUpperCase()`,
`equalsIgnoreCase()`, `StringBuilder`, `Character.isLetter()` / `isDigit()`, and staged
validation that returns the reason for failure rather than a bare boolean.

### Session 3 — OOP + control flow (`oop`, `control_flow`)

Week 3 shipped two separate Category C sheets, so this branch was built with two topic
packages. **`control_flow` is not on the branch tip right now** — commit `9b4bfdd` removed
all 15 files. They are intact in `af967e7` and restore with one command (see Known gaps).

| Type | Problems | On tip |
|---|---|---|
| OOP — class | Student record, hostel room state, library card defaults, course constructor, applicant counter | yes |
| OOP — assignment | Book record, exam hall occupancy, employee defaults, product constructor, order counter | yes |
| Control flow — assignment | All 15 problems across Levels 1–3 (the sheet asked for any five) | **deleted** |

Class definition, `new`, independent instance state, Java's default field values
(`null` / `0` / `0.0` / `false`), constructors with `this.field = parameter`, static
counters; `if`/`else if`/`else`, `switch` with `break` and `default`, `for` and `while`,
`break`/`continue`, nested loops, boolean flags.

### Session 4 — Functions & arrays (`array`)

| Type | Problem | Approach |
|---|---|---|
| Class | Two Sum | Brute-force nested scan |
| Class | Contains Duplicate | Brute-force pair comparison |
| Class | Merge Sorted Arrays | Two-pointer merge with tail drain |
| Class | Rotate Array | Index remap into a new array, `k % n` |
| Class | Best Time to Buy and Sell Stock | Single pass tracking min-so-far |
| Assignment | Product of Array Except Self | Prefix + suffix passes, no division, so zeros need no special case |
| Assignment | Maximum Subarray | Kadane's, seeded so an all-negative array returns its largest element |
| Assignment | 3Sum | Sort + two pointers, duplicates skipped at the anchor and both pointers |
| Assignment | Subarray Sum Equals K | Prefix sums in a `HashMap`, seeded with the empty prefix |
| Assignment | Find Minimum in Rotated Sorted Array | Modified binary search against the rightmost element |

## Known gaps

- **`control_flow` was deleted from `feature/session_3`.** Commit `9b4bfdd` ("updates") is
  a pure 15-file, 438-line deletion with nothing added. The branch README still documents
  all 15 problems, so the branch currently contradicts itself. Nothing is lost — restore
  with:

  ```bash
  git checkout feature/session_3
  git checkout af967e7 -- src/main/java/control_flow
  git commit -m "Restore control_flow assignment problems dropped in 9b4bfdd"
  ```

- `string/assigment_problems` (session 2) and `array/class_problems` (session 4) have no
  `package` declarations, so those files sit in the default package while their siblings
  are packaged. Compiles under IntelliJ, but breaks the `java -cp out <package>.<Class>`
  command above — add the declarations to make every branch consistent.
- `feature/session_4` is missing `src/main/resources/.gitkeep`, present on every other
  branch.
- `feature/session_1` and `feature/session_3` have no assignment/class gaps, but session 4
  still needs the divide-and-conquer O(n log n) alternative to Kadane's, noted as a common
  interview follow-up.

## Progress log

## Date: 05-09-2026 (later)

**Today's Work:**

- Pushed `9b4bfdd` to `feature/session_3`. Reviewing the diff afterwards showed it is a
  deletion-only commit: all 15 `control_flow/assigment_problems` files removed, no
  additions. Not intended — recorded under Known gaps with the restore command.

**Next Session Plan:**

- Restore `control_flow` from `af967e7` and push.
- Stop using bare `updates` / `x` as commit messages; a deletion-only commit under that
  name is invisible in the commit list.

**Issues Faced:**

- The deletion is only visible from `git diff --stat`, not from the commit message or the
  branch README, which still lists every control-flow problem.

---

## Date: 05-09-2026

**Today's Work:**

- Week 2 assignment sheet released and solved on `feature/session_2` in
  `string/assigment_problems`: ATM PIN length validator, library ISBN normalizer +
  validator, product inventory CSV parser, stop-word filtered word frequency, word
  reversal encoder.
- Week 4 live-session problems added to `feature/session_4` in `array/class_problems`:
  Two Sum, Contains Duplicate, Merge Sorted Arrays, Rotate Array, Best Time to Buy and
  Sell Stock.
- Rotate Array solved by remapping each index to `(i + k) % n` in a fresh array instead of
  shifting one step `k` times, which keeps it O(n) instead of O(n·k). `k % n` handles
  `k` larger than the array length.
- Best Time to Buy and Sell Stock done in one pass — profit is computed against the
  minimum seen so far *before* the minimum is updated, so a buy and sell never land on the
  same day.

**Next Session Plan:**

- Week 5 sheet.
- Add the missing `package` declarations flagged under Known gaps.
- Redo Two Sum and Contains Duplicate with a `HashMap` / `HashSet` for the O(n) versions —
  the brute-force ones are what the session asked for, but the hashed versions are what an
  interview expects.

**Issues Faced:**

- Rotate Array with `k` greater than `nums.length` threw
  `ArrayIndexOutOfBoundsException` until `k = k % n` was added at the top.
- The ISBN validator needed the same staged-failure pattern as the Week 2 bank reference
  problem: length first, then publisher code, then body — otherwise a wrong-length input
  reports a misleading reason.

---

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
