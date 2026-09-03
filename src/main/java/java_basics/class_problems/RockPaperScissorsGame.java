package java_basics.class_problems;

import java.util.Random;

/**
 * Week 1 - Class Problem 1 : The College Coding Arcade.
 * Plays N rounds of Rock-Paper-Scissors against the computer and prints a scoreboard.
 */
public class RockPaperScissorsGame {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    /** Decides one round from the player's point of view. */
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        boolean playerWins = (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));
        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        // Predefined player moves so the live demo is repeatable.
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        int rounds = playerMoves.length;

        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];

        Random random = new Random(2);          // fixed seed -> same demo every run
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = MOVES[random.nextInt(MOVES.length)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);

            if (results[i].equals("Player Wins")) {
                wins++;
            } else if (results[i].equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.printf("%-6s | %-12s | %-14s | %s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("%-6d | %-12s | %-14s | %s%n", (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println("-------------------------------------------------------");

        double winPercentage = (wins * 100.0) / rounds;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}
