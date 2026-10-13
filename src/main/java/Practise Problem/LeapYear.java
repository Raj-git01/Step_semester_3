import java.util.Scanner;

public class LeapYear {

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            System.out.println(isLeap(year) ? "Leap year" : "Not a leap year");
        }
        sc.close();
    }
}
