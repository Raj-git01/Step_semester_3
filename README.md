# Session 2 — Strings

**Branch:** `feature/session_2` · **Topic package:** `string`

## Structure

```
src/main/java/string/
  class_problems/         <- solved during the live session
  assigment_problems/     <- take-home assignment
```

## Class Problems (Day 2 Live-Coding Session)

| # | Problem | File |
|---|---------|------|
| 1 | Vowel & Consonant Counter | `class_problems/VowelConsonantCounter.java` |
| 2 | CSV Student Record Parser | `class_problems/CsvStudentRecordParser.java` |
| 3 | File Extension Validator | `class_problems/FileExtensionValidator.java` |
| 4 | Masked Phone Number Formatter | `class_problems/MaskedPhoneNumberFormatter.java` |
| 5 | Bank Transaction Reference Generator & Validator | `class_problems/BankTransactionReference.java` |

## Assignment Problems

The Week 2 assignment sheet has not been released on Google Classroom yet. The
`assigment_problems` package is in place and will be filled in on this same branch as soon
as the problems are published.

## Concepts covered

`charAt()`, `length()`, `split()`, `lastIndexOf()`, `substring()`, `equalsIgnoreCase()`,
`trim()`, `StringBuilder` (`append`/`insert`), `Character.isLetter()` / `isDigit()`,
array-length validation, and multi-stage validation without regex.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out string.class_problems.VowelConsonantCounter
java -cp out string.class_problems.BankTransactionReference
```

Every class has its own `main`, so each problem runs standalone.
