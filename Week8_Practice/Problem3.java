import java.util.*;

public class Problem3 {

    interface Delivery {
        double calculate(double weight, double distance, double customs);
    }

    static class Standard implements Delivery {
        public double calculate(double w, double d, double c) {
            return 5 + 0.5 * w + 0.1 * d;
        }
    }

    static class Express implements Delivery {
        public double calculate(double w, double d, double c) {
            return 15 + w + 0.2 * d;
        }
    }

    static class International implements Delivery {
        public double calculate(double w, double d, double c) {
            return 25 + 2 * w + 0.5 * d + c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double weight = sc.nextDouble();
            double distance = sc.nextDouble();
            double customs = 0;

            if (type.equals("INTERNATIONAL"))
                customs = sc.nextDouble();

            Delivery d;

            if (type.equals("STANDARD"))
                d = new Standard();
            else if (type.equals("EXPRESS"))
                d = new Express();
            else
                d = new International();

            double fee = d.calculate(weight, distance, customs);
            total += fee;

            System.out.printf("%s: %.2f%n", type, fee);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}