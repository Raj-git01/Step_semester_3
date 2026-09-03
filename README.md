# Session 1 — Java Fundamentals

**Branch:** `feature/session_1` · **Topic package:** `java_basics`

## Structure

```
src/main/java/java_basics/
  class_problems/         <- solved during the live session
  assigment_problems/     <- take-home assignment
```

## Class Problems (Day 1 Live-Coding Session)

| # | Problem | File |
|---|---------|------|
| 1 | Rock-Paper-Scissors Game | `class_problems/RockPaperScissorsGame.java` |
| 2 | Palindrome Checker (3 approaches) | `class_problems/PalindromeChecker.java` |
| 3 | BMI Calculator for a Team | `class_problems/BmiCalculator.java` |
| 4 | First Non-Repeating Character | `class_problems/FirstNonRepeatingCharacter.java` |
| 5 | Reverse Customer Name | `class_problems/ReverseCustomerName.java` |

## Assignment Problems (Week 1 Assignment)

| # | Problem | File |
|---|---------|------|
| 1 | Exam Hall Seat Duplication Checker | `assigment_problems/ExamHallSeatDuplicationChecker.java` |
| 2 | Typing Speed Test Accuracy Checker | `assigment_problems/TypingSpeedAccuracyChecker.java` |
| 3 | Traffic Signal Streak Analyzer | `assigment_problems/TrafficSignalStreakAnalyzer.java` |
| 4 | Warehouse Inventory Balancer | `assigment_problems/WarehouseInventoryBalancer.java` |
| 5 | Movie Review Word Length Profiler | `assigment_problems/MovieReviewWordLengthProfiler.java` |

## Concepts covered

Random number generation, loops, arrays and parallel arrays, recursion, string traversal,
character frequency counting, nested loops, running maximum, accumulator variables,
percentage calculation, formatted tabular output.

Problem 1 of the assignment uses **arrays and loops only** — no Collections class is used
anywhere in it, as the problem statement requires.

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out java_basics.class_problems.RockPaperScissorsGame
java -cp out java_basics.assigment_problems.ExamHallSeatDuplicationChecker
```

Every class has its own `main`, so each problem runs standalone.
