import java.util.*;

public class Problem5 {

    interface Transport {
        double calculate(double distance, double factor);
    }

    static class Bus implements Transport {
        public double calculate(double d, double f) {
            return Math.min(10, 2 + 0.1 * d);
        }
    }

    static class Train implements Transport {
        public double calculate(double d, double f) {
            return 3 + 0.15 * d;
        }
    }

    static class Metro implements Transport {
        public double calculate(double d, double f) {
            return (1.5 + 0.2 * d) * f;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double distance = sc.nextDouble();
            double factor = 1;

            if (type.equals("METRO"))
                factor = sc.nextDouble();

            Transport t;

            if (type.equals("BUS"))
                t = new Bus();
            else if (type.equals("TRAIN"))
                t = new Train();
            else
                t = new Metro();

            double fare = t.calculate(distance, factor);
            total += fare;

            System.out.printf("%s: %.2f%n", type, fare);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}