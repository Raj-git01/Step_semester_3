# Session 3 — OOP (Classes and Objects) + Control Flow

**Branch:** `feature/session_3` · **Topic packages:** `oop`, `control_flow`

Week 3 shipped two separate Category C sheets, so this session carries two topic packages.

## Structure

```
src/main/java/
  oop/
    class_problems/         <- OOP problems solved in the live session
    assigment_problems/     <- OOP homework assignment
  control_flow/
    assigment_problems/     <- Category C assignment sheet (Levels 1-3)
```

## OOP — Class Problems

| # | Problem | File |
|---|---------|------|
| L1 | Simple Student Record Class | `oop/class_problems/StudentRecord.java` |
| L2 | Two Objects, Two Separate States | `oop/class_problems/HostelRoomState.java` |
| L3 | Reading Java's Default Field Values | `oop/class_problems/LibraryCardDefaults.java` |
| L4 | Basic Constructor for a Course | `oop/class_problems/CourseConstructor.java` |
| L5 | Counting Objects With a Static Field | `oop/class_problems/ApplicantCounter.java` |

## OOP — Assignment Problems (Homework)

| # | Problem | File |
|---|---------|------|
| L1 | Simple Book Record Class | `oop/assigment_problems/BookRecord.java` |
| L2 | Two Objects, Two Separate Occupancy Counts | `oop/assigment_problems/ExamHallOccupancy.java` |
| L3 | Reading Java's Default Field Values | `oop/assigment_problems/EmployeeDefaults.java` |
| L4 | Basic Constructor for a Product | `oop/assigment_problems/ProductConstructor.java` |
| L5 | Counting Objects With a Static Field | `oop/assigment_problems/OrderCounter.java` |

## Control Flow — Assignment Problems

The sheet asks for **any five**; all fifteen are solved.

### Level 1 — one concept at a time

| # | Problem | File |
|---|---------|------|
| P1 | Voting Eligibility Checker | `control_flow/assigment_problems/VotingEligibilityChecker.java` |
| P2 | Positive, Negative, or Zero Classifier | `control_flow/assigment_problems/PositiveNegativeZeroClassifier.java` |
| P3 | Print Numbers 1 to N | `control_flow/assigment_problems/PrintNumbersUpToN.java` |
| P4 | Sum of Natural Numbers Using a While Loop | `control_flow/assigment_problems/SumOfNaturalNumbers.java` |
| P5 | Day Name From Number | `control_flow/assigment_problems/DayNameFromNumber.java` |

### Level 2 — two concepts combined

| # | Problem | File |
|---|---------|------|
| P1 | Grade Classifier With Logical Operators | `control_flow/assigment_problems/GradeClassifierWithAttendance.java` |
| P2 | Login Attempt Simulator With Break | `control_flow/assigment_problems/LoginAttemptSimulator.java` |
| P3 | Skip Multiples Printer Using Continue | `control_flow/assigment_problems/SkipMultiplesPrinter.java` |
| P4 | Menu-Driven Calculator Using Switch | `control_flow/assigment_problems/MenuDrivenCalculator.java` |
| P5 | Prime Number Checker | `control_flow/assigment_problems/PrimeNumberChecker.java` |

### Level 3 — several concepts together

| # | Problem | File |
|---|---------|------|
| P1 | Number Pyramid Pattern Printer | `control_flow/assigment_problems/NumberPyramidPattern.java` |
| P2 | ATM PIN Retry System | `control_flow/assigment_problems/AtmPinRetrySystem.java` |
| P3 | Traffic Signal Simulator | `control_flow/assigment_problems/TrafficSignalSimulator.java` |
| P4 | Multiplication Table Generator With Input Validation | `control_flow/assigment_problems/MultiplicationTableGenerator.java` |
| P5 | Guess the Number Game | `control_flow/assigment_problems/GuessTheNumberGame.java` |

## Concepts covered

Class definition, object creation with `new`, direct field access, independent instance
state, Java's default field values (`null` / `0` / `0.0` / `false`), constructors and
`this.field = parameter`, static fields accessed through the class name; boolean
expressions, `if` / `else if` / `else`, `switch` with `break` and `default`, `for` and
`while` loops, `break` / `continue`, nested loops, boolean flags, and the modulus operator.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out oop.class_problems.StudentRecord
java -cp out control_flow.assigment_problems.GuessTheNumberGame
```

Every class has its own `main`, so each problem runs standalone.
