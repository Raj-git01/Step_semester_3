import java.util.*;
import java.time.*;

public class Problem5 {

    interface Plan {
        LocalDate renewalDate(LocalDate start);
    }

    static class Basic implements Plan {
        public LocalDate renewalDate(LocalDate d) {
            return d.plusDays(30);
        }
    }

    static class Standard implements Plan {
        public LocalDate renewalDate(LocalDate d) {
            return d.plusDays(90);
        }
    }

    static class Premium implements Plan {
        public LocalDate renewalDate(LocalDate d) {
            return d.plusDays(365);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String name = sc.next();
            LocalDate start = LocalDate.parse(sc.next());

            Plan p;

            if (type.equals("BASIC"))
                p = new Basic();
            else if (type.equals("STANDARD"))
                p = new Standard();
            else
                p = new Premium();

            System.out.println(
                name + ": " + p.renewalDate(start)
            );
        }
    }
}