/**
 * PROBLEM 4 - Hackathon Seating Grid Optimizer
 * rowAverage() does ONE job: average one row. It never decides Quiet vs Buzzing.
 * classifyRows() is the only place the threshold is compared.
 * Jagged-safe: uses row.length per row, never seatingScores[0].length.
 */
public class HackathonSeatingGridOptimizer {

    private static double rowAverage(int[] row) {
        if (row == null || row.length == 0) return 0.0;
        long sum = 0;                       // long guards against int overflow
        for (int seat : row) {
            sum += seat;
        }
        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);   // called exactly once per row
            if (i > 0) sb.append(" | ");
            sb.append("Row ").append(i).append(": ")
              .append(avg < threshold ? "Quiet Zone" : "Buzzing Zone");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] grid = {
                {40, 50, 45},
                {85, 90, 95},
                {30, 20, 25}
        };
        System.out.println(classifyRows(grid, 60));
        // Row 0: Quiet Zone | Row 1: Buzzing Zone | Row 2: Quiet Zone

        int[][] jagged = {
                {60},                    // avg 60.0 -> at threshold -> Buzzing
                {10, 20, 30, 40, 50},    // avg 30.0 -> Quiet
                {99, 1}                  // avg 50.0 -> Quiet
        };
        System.out.println(classifyRows(jagged, 60));
        // Row 0: Buzzing Zone | Row 1: Quiet Zone | Row 2: Quiet Zone
    }
}
