package control_flow.assigment_problems;

/**
 * Level 3 - P3 : Traffic Signal Simulator.
 * A switch inside a for loop, with the state wrapping back to Red using modulus.
 */
public class TrafficSignalSimulator {

    public static void simulateTrafficSignal(int cycles) {
        int state = 0;                         // 0 = Red, 1 = Green, 2 = Yellow

        for (int i = 0; i < cycles; i++) {
            switch (state) {
                case 0:
                    System.out.println("Red - Stop");
                    break;
                case 1:
                    System.out.println("Green - Go");
                    break;
                case 2:
                    System.out.println("Yellow - Prepare to stop");
                    break;
                default:
                    System.out.println("Unknown signal state");
                    break;
            }
            state = (state + 1) % 3;
        }
    }

    public static void main(String[] args) {
        simulateTrafficSignal(3);
        System.out.println("---");
        simulateTrafficSignal(5);
    }
}
