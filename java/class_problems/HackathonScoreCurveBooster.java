import java.util.Arrays;

/**
 * PROBLEM 1 - Hackathon Score Curve Booster
 * Key idea: an int[] parameter is a copy of the REFERENCE, not the data.
 * Writing scores[i] touches the caller's exact same memory. No return needed.
 */
public class HackathonScoreCurveBooster {

    static void curveScores(int[] scores, int bonus) {
        if (scores == null) return;
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;          // mutate in place, caller sees it
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));   // [80, 95, 70]

        int[] big = {100, 0, 47, 99};
        curveScores(big, 5);
        System.out.println(Arrays.toString(big));      // [105, 5, 52, 104]

        int[] zeroBonus = {12, 34};
        curveScores(zeroBonus, 0);
        System.out.println(Arrays.toString(zeroBonus)); // [12, 34]
    }
}
