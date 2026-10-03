import java.util.*;

public class Problem3 {

    interface Room {
        double calculate(int units, int occupants);
    }

    static class Single implements Room {
        public double calculate(int u, int o) {
            return 8 * u;
        }
    }

    static class Shared implements Room {
        public double calculate(int u, int o) {
            return (6 * u) / (double) o;
        }
    }

    static class AC implements Room {
        public double calculate(int u, int o) {
            return 10 * u + 200;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            int units = sc.nextInt();
            int occupants = 1;

            if (type.equals("SHARED"))
                occupants = sc.nextInt();

            Room r;

            if (type.equals("SINGLE"))
                r = new Single();
            else if (type.equals("SHARED"))
                r = new Shared();
            else
                r = new AC();

            double bill = r.calculate(units, occupants);
            total += bill;

            System.out.printf("%s: %.2f%n", type, bill);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}