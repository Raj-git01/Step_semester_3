import java.util.*;

public class Problem4 {

    interface Employee {
        double calculateBonus(double salary);
    }

    static class FullTime implements Employee {
        public double calculateBonus(double s) {
            return s * 0.10;
        }
    }

    static class PartTime implements Employee {
        public double calculateBonus(double s) {
            return s * 0.05;
        }
    }

    static class Intern implements Employee {
        public double calculateBonus(double s) {
            return 2000;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            Employee e;

            if (type.equals("FULLTIME"))
                e = new FullTime();
            else if (type.equals("PARTTIME"))
                e = new PartTime();
            else
                e = new Intern();

            double bonus = e.calculateBonus(salary);
            total += bonus;

            System.out.printf("%s: %.2f%n", name, bonus);
        }

        System.out.printf("Total Bonus: %.2f%n", total);
    }
}