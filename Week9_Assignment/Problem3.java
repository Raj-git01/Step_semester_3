import java.util.*;

public class Problem3 {

    interface BusUser {
        double transportFee();
    }

    static abstract class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        abstract double fee();
    }

    static class DayScholar extends Student implements BusUser {
        DayScholar(String name) {
            super(name);
        }

        double fee() {
            return 40000 + transportFee();
        }

        public double transportFee() {
            return 12000;
        }
    }

    static class Hosteller extends Student {
        Hosteller(String name) {
            super(name);
        }

        double fee() {
            return 40000 + 60000;
        }
    }

    static class Scholar extends Student implements BusUser {
        Scholar(String name) {
            super(name);
        }

        double fee() {
            return 20000 + transportFee();
        }

        public double transportFee() {
            return 12000;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student s;

            if (type.equals("DAY_SCHOLAR"))
                s = new DayScholar(name);
            else if (type.equals("HOSTELLER"))
                s = new Hosteller(name);
            else
                s = new Scholar(name);

            double fee = s.fee();
            total += fee;

            System.out.printf("%s: %.2f%n", name, fee);
        }

        System.out.printf("Total Collected: %.2f%n", total);
    }
}