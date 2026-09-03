package control_flow.assigment_problems;

/**
 * Level 3 - P4 : Multiplication Table Generator With Input Validation.
 * continue skips invalid candidates, break stops after the first valid table.
 */
public class MultiplicationTableGenerator {

    public static void generateFirstValidTable(int[] candidates) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] < 1) {
                System.out.println("Skipping invalid number: " + candidates[i]);
                continue;
            }

            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.println(candidates[i] + " x " + multiplier + " = " + (candidates[i] * multiplier));
            }
            break;                             // first valid candidate only
        }
    }

    public static void main(String[] args) {
        generateFirstValidTable(new int[]{-3, 0, 7, 9});
    }
}
