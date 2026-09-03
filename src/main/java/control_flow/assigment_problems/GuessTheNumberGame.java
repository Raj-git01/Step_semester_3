package control_flow.assigment_problems;

/**
 * Level 3 - P5 : Guess the Number Game.
 * A while loop bounded by the try limit, with hints after every wrong guess.
 */
public class GuessTheNumberGame {

    public static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tries = 0;
        boolean guessed = false;

        while (tries < maxTries && tries < guesses.length && !guessed) {
            int guess = guesses[tries];

            if (guess > secretNumber) {
                System.out.println("Too high");
            } else if (guess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            }
            tries++;
        }

        if (!guessed) {
            System.out.println("Out of tries - the number was " + secretNumber);
        }
    }

    public static void main(String[] args) {
        guessTheNumber(42, 4, new int[]{20, 60, 42});
        System.out.println("---");
        guessTheNumber(42, 2, new int[]{10, 15});
    }
}
