package java_basics.class_problems;

/**
 * Week 1 - Class Problem 3 : The Corporate Wellness Program.
 * Computes BMI for a team of 10 employees and prints a classified wellness report.
 */
public class BmiCalculator {

    /** Classifies a BMI value into the standard health bands. */
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    /** Prints the full wellness table for the whole team. */
    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.printf("%-7s | %-10s | %-11s | %-6s | %s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%-7d | %-10.2f | %-11.1f | %-6.2f | %s%n",
                    (i + 1), heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        double[] heights = {1.75, 1.60, 1.82, 1.68, 1.55, 1.90, 1.71, 1.66, 1.78, 1.62};
        double[] weights = {70.0, 90.0, 78.5, 52.0, 45.0, 105.0, 68.0, 61.5, 88.0, 50.0};
        printWellnessReport(heights, weights);
    }
}
