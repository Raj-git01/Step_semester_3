import java.util.*;

public class Problem4 {

    interface Question {
        double grade(String correct, String student, double points);
    }

    static class MCQ implements Question {
        public double grade(String c, String s, double p) {
            return c.equals(s) ? p : 0;
        }
    }

    static class TF implements Question {
        public double grade(String c, String s, double p) {
            return c.equals(s) ? p : 0;
        }
    }

    static class Essay implements Question {
        public double grade(String c, String s, double p) {

            String[] keywords = c.split(",");
            String answer = s.toLowerCase();

            int count = 0;

            for (String k : keywords) {
                if (answer.contains(k.trim().toLowerCase()))
                    count++;
            }

            if (count >= 2)
                return p * 0.75;
            else if (count == 1)
                return p * 0.50;
            else
                return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextLine().isEmpty() ? 0 : Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            List<String> parts = new ArrayList<>();
            java.util.regex.Matcher m =
                java.util.regex.Pattern.compile("\"([^\"]*)\"|(\\S+)")
                .matcher(line);

            while (m.find()) {
                parts.add(m.group(1) != null ? m.group(1) : m.group(2));
            }

            String type = parts.get(0);
            String correct = parts.get(2);
            String student = parts.get(3);
            double points = Double.parseDouble(parts.get(4));

            Question q;

            if (type.equals("MCQ"))
                q = new MCQ();
            else if (type.equals("TF"))
                q = new TF();
            else
                q = new Essay();

            double score = q.grade(correct, student, points);
            total += score;

            System.out.printf("%s: %.2f%n", type, score);
        }

        System.out.printf("Total Score: %.2f%n", total);
    }
}