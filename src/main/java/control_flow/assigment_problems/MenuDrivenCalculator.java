package control_flow.assigment_problems;

/**
 * Level 2 - P4 : Menu-Driven Calculator Using Switch.
 * A switch on the operator, with an extra if guarding division by zero.
 */
public class MenuDrivenCalculator {

    public static void calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }

    public static void main(String[] args) {
        calculate(10, 4, '+');
        calculate(10, 0, '/');
        calculate(10, 4, '%');
    }
}
