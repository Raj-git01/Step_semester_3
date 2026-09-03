package control_flow.assigment_problems;

/**
 * Level 1 - P2 : Positive, Negative, or Zero Classifier.
 * A three-way decision using an if / else if / else ladder.
 */
public class PositiveNegativeZeroClassifier {

    public static void classifyNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        classifyNumber(15);
        classifyNumber(-4);
        classifyNumber(0);
    }
}
