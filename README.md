# Session 3 — OOP (Classes and Objects)

**Branch:** `feature/session_3` · **Topic packages:** `oop`

Week 3 shipped two separate Category C sheets, so this session carries two topic packages.

## Structure

```
src/main/java/
  oop/
    class_problems/         <- OOP problems solved in the live session
    assigment_problems/     <- OOP homework assignment
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


## Concepts covered

Class definition, object creation with `new`, direct field access, independent instance
state, Java's default field values (`null` / `0` / `0.0` / `false`), constructors and
`this.field = parameter`, static fields accessed through the class name; boolean
expressions

## How to run

```bash
javac -d out $(find src/main/java -name '*.java')
java -cp out oop.class_problems.StudentRecord
java -cp out control_flow.assigment_problems.GuessTheNumberGame
```

Every class has its own `main`, so each problem runs standalone.
