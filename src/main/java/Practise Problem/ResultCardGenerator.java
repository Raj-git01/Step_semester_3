import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        int total = 0;
        for (int m : marks) total += m;
        return (double) total / marks.length;
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public void printCard() {
        System.out.printf("%s: Average %.1f, Grade %c%n",
                name.toUpperCase(), getAverage(), getGrade());
    }
}

public class ResultCardGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Each line like: Asha [80, 90, 70]
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.replaceAll("[\\[\\],]", " ").trim().split("\\s+");
            String name = parts[0];
            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                marks[i] = Integer.parseInt(parts[i + 1]);
            }

            new Student(name, marks).printCard();
        }
        sc.close();
    }
}
