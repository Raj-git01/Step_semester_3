import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accepts "[3, 8, 12, 5, 7, 10]" or "3 8 12 5 7 10"
        String line = sc.nextLine();
        String[] parts = line.replaceAll("[\\[\\],]", " ").trim().split("\\s+");

        int even = 0, odd = 0;
        for (String p : parts) {
            int num = Integer.parseInt(p);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        sc.close();
    }
}
