import java.util.*;

public class Problem1 {

    interface Customer {
        double calculate(double amount);
    }

    static class Student implements Customer {
        public double calculate(double a) {
            return a * 0.90;
        }
    }

    static class Staff implements Customer {
        public double calculate(double a) {
            return a * 0.95;
        }
    }

    static class Guest implements Customer {
        public double calculate(double a) {
            return a + 10;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            double amount = sc.nextDouble();

            Customer c;

            if (type.equals("STUDENT"))
                c = new Student();
            else if (type.equals("STAFF"))
                c = new Staff();
            else
                c = new Guest();

            double result = c.calculate(amount);
            total += result;

            System.out.printf("%s: %.2f%n", type, result);
        }

        System.out.printf("Total: %.2f%n", total);
    }
}