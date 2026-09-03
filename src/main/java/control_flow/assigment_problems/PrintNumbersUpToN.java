package control_flow.assigment_problems;

/**
 * Level 1 - P3 : Print Numbers 1 to N.
 * The simplest possible for loop, one number per line.
 */
public class PrintNumbersUpToN {

    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbersUpToN(5);
    }
}
