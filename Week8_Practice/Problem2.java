import java.util.*;
import java.time.*;

public class Problem2 {

    interface LibraryItem {
        LocalDate getDueDate(LocalDate date);
    }

    static class Book implements LibraryItem {
        public LocalDate getDueDate(LocalDate date) {
            return date.plusDays(14);
        }
    }

    static class DVD implements LibraryItem {
        public LocalDate getDueDate(LocalDate date) {
            return date.plusDays(7);
        }
    }

    static class Magazine implements LibraryItem {
        public LocalDate getDueDate(LocalDate date) {
            return date.plusDays(3);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        LocalDate current = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            int space = line.indexOf(' ');

            String type = line.substring(0, space);
            String title = line.substring(space + 1).replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK"))
                item = new Book();
            else if (type.equals("DVD"))
                item = new DVD();
            else
                item = new Magazine();

            System.out.println(
                title + ": " + item.getDueDate(current)
            );
        }
    }
}