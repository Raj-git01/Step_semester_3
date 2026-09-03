package control_flow.assigment_problems;

/**
 * Level 2 - P5 : Prime Number Checker.
 * A boolean flag plus break, so the loop stops the moment a factor appears.
 */
public class PrimeNumberChecker {

    public static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println("Not Prime");
            return;
        }

        boolean prime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }

    public static void main(String[] args) {
        checkPrime(17);
        checkPrime(18);
    }
}
