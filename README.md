# Session 2 — Strings

**Branch:** `feature/session_2` · **Topic package:** `string`

Week 2 of STEP Semester 3. Both the live-session sheet and the take-home assignment are
complete — 10 problems, plain JDK, no external dependencies.

## Structure

```
src/main/java/string/
  class_problems/         <- solved during the live session
  assigment_problems/     <- take-home assignment
```

## Class Problems (live session)

| # | Problem | File |
|---|---------|------|
| 1 | Vowel & Consonant Counter | `class_problems/VowelConsonantCounter.java` |
| 2 | CSV Student Record Parser | `class_problems/CsvStudentRecordParser.java` |
| 3 | File Extension Validator | `class_problems/FileExtensionValidator.java` |
| 4 | Masked Phone Number Formatter | `class_problems/MaskedPhoneNumberFormatter.java` |
| 5 | Bank Transaction Reference Generator & Validator | `class_problems/BankTransactionReference.java` |

## Assignment Problems (take-home)

| # | Problem | File | Core technique |
|---|---------|------|----------------|
| A1 | ATM PIN Length Validator | `assigment_problems/AtmPinLengthValidator.java` | `length()` guard, exactly 4 characters |
| A2 | Product Inventory CSV Parser | `assigment_problems/ProductInventoryCSVParser.java` | `split(",")` then field-count validation before indexing |
| A3 | Word Reversal Encoder | `assigment_problems/WordReversalEncoder.java` | `StringBuilder.reverse()` per word, spaces rebuilt manually |
| A4 | Library ISBN Normalizer & Validator | `assigment_problems/LibraryISBNNormalizerValidator.java` | `trim()` + `substring()` normalize, then staged validation |
| A5 | Stop-Word Filtered Word Frequency | `assigment_problems/StopWordFilteredWordFrequency.java` | `LinkedHashMap` counting, then sort by count descending |

## Notes on the tricky bits

- **A2** checks `fields.length != 3` *before* reading `fields[0..2]`. A short line would
  otherwise throw `ArrayIndexOutOfBoundsException` instead of printing `Invalid Record` —
  `split()` silently returns a shorter array rather than padding it.
- **A3** appends the separator only when the current word is not the last one, so the
  result has no trailing space. Joining first and trimming afterwards would also work but
  hides the off-by-one instead of handling it.
- **A4** uses the same staged-failure pattern as the Bank Transaction Reference problem
  from the live session: length first, then the 3-letter publisher code, then the digit
  body. Checking out of order makes a wrong-length input report a misleading reason.
  `normalizeCode()` trims and upper-cases only the publisher code, leaving the numeric
  tail untouched.
- **A5** counts into a `LinkedHashMap` so words that tie on frequency stay in the order
  they first appeared — a plain `HashMap` would make the tie order arbitrary between runs.
  Punctuation is stripped with `replace()` and the split is on `\\s+` so runs of
  whitespace do not produce empty tokens.

## Concepts covered

`charAt()`, `length()`, `split()`, `lastIndexOf()`, `substring()`, `equalsIgnoreCase()`,
`trim()`, `toLowerCase()` / `toUpperCase()`, `replace()`, `isEmpty()`,
`StringBuilder` (`append` / `insert` / `reverse`), `Character.isLetter()` / `isDigit()`,
array-length validation, `LinkedHashMap` frequency counting with `getOrDefault()`,
sorting entries with a `Comparator`, and multi-stage validation without regex.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out string.class_problems.VowelConsonantCounter
java -cp out string.class_problems.BankTransactionReference
```

Every class has its own `main`, so each problem runs standalone.

## Known gaps

- The five files in `assigment_problems` have **no `package` declaration**, so they sit in
  the default package while `class_problems` is packaged as `string.class_problems`.
  IntelliJ runs them anyway, but `java -cp out string.assigment_problems.WordReversalEncoder`
  will not resolve. Add `package string.assigment_problems;` to the top of each file.
- `StopWordFilteredWordFrequency` imports `java.util.Collections` but never uses it.
