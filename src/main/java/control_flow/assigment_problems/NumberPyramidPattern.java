package control_flow.assigment_problems;

/**
 * Level 3 - P1 : Number Pyramid Pattern Printer.
 * An outer loop for rows and an inner loop for the repeats on each row.
 */
public class NumberPyramidPattern {

    public static void printNumberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberPyramid(4);
    }
}
