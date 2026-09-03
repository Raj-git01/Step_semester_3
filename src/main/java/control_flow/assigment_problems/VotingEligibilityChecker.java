package control_flow.assigment_problems;

/**
 * Level 1 - P1 : Voting Eligibility Checker.
 * One boolean expression driving a single if / else.
 */
public class VotingEligibilityChecker {

    public static void checkVotingEligibility(int age) {
        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkVotingEligibility(20);
        checkVotingEligibility(16);
    }
}
