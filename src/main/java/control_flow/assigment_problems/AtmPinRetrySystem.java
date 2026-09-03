package control_flow.assigment_problems;

/**
 * Level 3 - P2 : ATM PIN Retry System.
 * A while loop guarded by both a counter and a success flag.
 */
public class AtmPinRetrySystem {

    public static void atmPinRetry(String correctPin, String[] attempts) {
        int attempt = 0;
        boolean accepted = false;

        while (attempt < attempts.length && !accepted) {
            if (attempts[attempt].equals(correctPin)) {
                System.out.println("PIN accepted");
                accepted = true;
                break;
            }
            attempt++;
        }

        if (!accepted) {
            System.out.println("Card blocked - too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        atmPinRetry("4821", new String[]{"1111", "4821"});
        atmPinRetry("4821", new String[]{"1111", "2222", "3333"});
    }
}
