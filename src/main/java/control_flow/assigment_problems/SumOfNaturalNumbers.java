package control_flow.assigment_problems;

/**
 * Level 1 - P4 : Sum of Natural Numbers Using a While Loop.
 * An accumulator variable driven by a manual counter.
 */
public class SumOfNaturalNumbers {

    public static void sumOfNaturalNumbers(int n) {
        int counter = 1;
        int total = 0;

        while (counter <= n) {
            total += counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + total);
    }

    public static void main(String[] args) {
        sumOfNaturalNumbers(5);
        sumOfNaturalNumbers(10);
    }
}
