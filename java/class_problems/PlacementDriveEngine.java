import java.util.Arrays;

/**
 * PROBLEM 5 - Placement Drive Shortlisting & Ranking Engine
 *
 * Thresholds chosen to reproduce the sample exactly:
 *   CGPA-only fast path : cgpa >= 7.0
 *   Borderline path     : cgpa >= 6.5 AND codingScore >= 60
 *   Composite score     : cgpa * 10 + codingScore * 0.5
 *
 * Sample check:
 *   Aisha 8.2/40 -> cgpa bar cleared      -> 82.0 + 20.0  = 102.0
 *   Karan 7.5/20 -> cgpa bar cleared      -> 75.0 + 10.0  =  85.0
 *   Rohit 6.8/65 -> borderline bar cleared-> 68.0 + 32.5  = 100.5
 *   Meena 6.0/90 -> 6.0 < 6.5, both bars fail -> dropped, high coding score
 *                   cannot rescue a CGPA that low
 *
 * Ranking is done by Arrays.sort() alone. compareTo() flips the operands to
 * get DESCENDING order without a Comparator and without a hand-written sort.
 */
public class PlacementDriveEngine {

    static class Candidate implements Comparable<Candidate> {
        private final String name;
        private final double cgpa;
        private final int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public String getName()      { return name; }
        public double getCgpa()      { return cgpa; }
        public int getCodingScore()  { return codingScore; }

        public double compositeScore() {
            return cgpa * 10 + codingScore * 0.5;
        }

        @Override
        public int compareTo(Candidate other) {
            // other first => descending
            return Double.compare(other.compositeScore(), this.compositeScore());
        }
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    static String shortlistAndRank(Candidate[] candidates) {
        // pass 1: count survivors so the shortlist array is exactly sized
        int count = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa())
                    || isEligible(c.getCgpa(), c.getCodingScore())) {
                count++;
            }
        }
        if (count == 0) return "No candidates shortlisted";

        // pass 2: fill
        Candidate[] shortlisted = new Candidate[count];
        int idx = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa())
                    || isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted[idx++] = c;
            }
        }

        Arrays.sort(shortlisted);   // compareTo does 100% of the ranking work

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            if (i > 0) sb.append(" | ");
            sb.append(i + 1).append(". ")
              .append(shortlisted[i].getName())
              .append(" (")
              .append(String.format("%.1f", shortlisted[i].compositeScore()))
              .append(")");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] batch = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(batch));
        // 1. Aisha (102.0) | 2. Rohit (100.5) | 3. Karan (85.0)

        Candidate[] noneQualify = {
                new Candidate("Dev", 5.0, 100),
                new Candidate("Sara", 6.4, 99)
        };
        System.out.println(shortlistAndRank(noneQualify));
        // No candidates shortlisted
    }
}
