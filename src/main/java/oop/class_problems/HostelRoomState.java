package oop.class_problems;

/** One hostel room and its own occupied-bed count. */
class HostelRoom {
    String roomNo;
    int occupied;
}

/**
 * Week 3 - Class Problem L2 : Two Objects, Two Separate States.
 * Proves that two objects never share instance fields.
 */
public class HostelRoomState {

    public static void main(String[] args) {
        HostelRoom roomA = new HostelRoom();
        roomA.roomNo = "C-101";

        HostelRoom roomB = new HostelRoom();
        roomB.roomNo = "C-102";

        // Only roomA is touched, three separate times.
        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println(roomA.roomNo + " occupied: " + roomA.occupied);
        System.out.println(roomB.roomNo + " occupied: " + roomB.occupied);
    }
}
