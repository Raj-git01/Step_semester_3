import java.util.*;

public class Problem5 {

    static abstract class Booking {
        static final double BOOKING_FEE = 50;
        double distance;

        Booking(double distance) {
            this.distance = distance;
        }

        abstract double baseFare();

        double total() {
            return baseFare() + BOOKING_FEE;
        }
    }

    static class Bus extends Booking {
        Bus(double distance) {
            super(distance);
        }

        double baseFare() {
            return distance * 2;
        }
    }

    static class Train extends Booking {
        Train(double distance) {
            super(distance);
        }

        double baseFare() {
            return distance * 1.5;
        }
    }

    static class Flight extends Booking {
        Flight(double distance) {
            super(distance);
        }

        double baseFare() {
            return 2500 + distance * 4;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            Booking b;

            if (type.equals("BUS"))
                b = new Bus(distance);
            else if (type.equals("TRAIN"))
                b = new Train(distance);
            else
                b = new Flight(distance);

            System.out.printf(
                "%s: %.2f%n",
                type, b.total()
            );
        }
    }
}