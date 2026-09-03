package control_flow.assigment_problems;

/**
 * Level 2 - P3 : Skip Multiples Printer Using Continue.
 * Prints 1 to 20 but silently skips every multiple of 3.
 */
public class SkipMultiplesPrinter {

    public static void printSkippingMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printSkippingMultiplesOfThree();
    }
}
