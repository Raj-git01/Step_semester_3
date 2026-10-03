import java.util.*;

public class Problem5 {

    interface SaverMode {
        double saverUnits(double units);
    }

    static abstract class Appliance {
        double hours;

        Appliance(double hours) {
            this.hours = hours;
        }

        abstract double power();

        double units() {
            return power() * hours / 1000;
        }
    }

    static class Fridge extends Appliance {
        Fridge(double hours) {
            super(hours);
        }

        double power() {
            return 150;
        }
    }

    static class AC extends Appliance implements SaverMode {
        AC(double hours) {
            super(hours);
        }

        double power() {
            return 1500;
        }

        public double saverUnits(double units) {
            return units * 0.75;
        }
    }

    static class TV extends Appliance {
        TV(double hours) {
            super(hours);
        }

        double power() {
            return 100;
        }
    }

    static class Washer extends Appliance implements SaverMode {
        Washer(double hours) {
            super(hours);
        }

        double power() {
            return 500;
        }

        public double saverUnits(double units) {
            return units * 0.75;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            Appliance a;

            if (type.equals("FRIDGE"))
                a = new Fridge(hours);
            else if (type.equals("AC"))
                a = new AC(hours);
            else if (type.equals("TV"))
                a = new TV(hours);
            else
                a = new Washer(hours);

            if (saver && !(a instanceof SaverMode)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double units = a.units();

            if (saver)
                units = ((SaverMode) a).saverUnits(units);

            double cost = units * 8;
            totalCost += cost;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                type, units, cost
            );
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}