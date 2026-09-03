package oop.assigment_problems;

/** One exam hall and its own filled-seat count. */
class ExamHall {
    String hallName;
    int seatsFilled;
}

/**
 * Week 3 - Assignment Problem L2 : Two Objects, Two Separate Occupancy Counts.
 */
public class ExamHallOccupancy {

    public static void main(String[] args) {
        ExamHall hallA = new ExamHall();
        hallA.hallName = "Block-3 Hall A";

        ExamHall hallB = new ExamHall();
        hallB.hallName = "Block-3 Hall B";

        // Four increments, all of them on hallA only.
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}
