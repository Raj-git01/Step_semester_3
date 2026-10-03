import java.util.*;

public class Problem2 {

    interface Vehicle {
        double calculate(int hours);
    }

    static class Bike implements Vehicle {
        public double calculate(int h) {
            return 10 * h;
        }
    }

    static class Car implements Vehicle {
        public double calculate(int h) {
            return 30 + (h - 1) * 20;
        }
    }

    static class Truck implements Vehicle {
        public double calculate(int h) {
            return Math.max(100, 50 * h);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int hours = sc.nextInt();

            Vehicle v;

            if (type.equals("BIKE"))
                v = new Bike();
            else if (type.equals("CAR"))
                v = new Car();
            else
                v = new Truck();

            double charge = v.calculate(hours);
            total += charge;

            System.out.printf("%s: %.2f%n", type, charge);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}