import java.util.*;

public class Problem1 {

    static abstract class Ticket {
        static final double FEE = 20;
        int count;

        Ticket(int count) {
            this.count = count;
        }

        abstract double price();

        double total() {
            return (price() + FEE) * count;
        }
    }

    static class Regular extends Ticket {
        Regular(int count) {
            super(count);
        }

        double price() {
            return 150;
        }
    }

    static class Premium extends Ticket {
        Premium(int count) {
            super(count);
        }

        double price() {
            return 250;
        }
    }

    static class Recliner extends Ticket {
        Recliner(int count) {
            super(count);
        }

        double price() {
            return 400;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int count = sc.nextInt();

            Ticket t;

            if (type.equals("REGULAR"))
                t = new Regular(count);
            else if (type.equals("PREMIUM"))
                t = new Premium(count);
            else
                t = new Recliner(count);

            double amount = t.total();
            total += amount;

            System.out.printf("%s: %.2f%n", type, amount);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}