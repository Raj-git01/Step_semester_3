import java.util.Arrays;
import java.util.Scanner;

public class InPlaceArrayReversal {

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accepts "[11, 22, 33, 44]" or "11 22 33 44"
        String line = sc.nextLine();
        String[] parts = line.replaceAll("[\\[\\],]", " ").trim().split("\\s+");

        int[] tokens = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            tokens[i] = Integer.parseInt(parts[i]);
        }

        reverse(tokens);
        System.out.println(Arrays.toString(tokens));
        sc.close();
    }
}
