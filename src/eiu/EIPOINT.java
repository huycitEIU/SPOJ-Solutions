package eiu;

import java.util.Scanner;

public class EIPOINT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        scanner.close();

        System.out.println(calculate(score));
    }

    private static String calculate(int score) {
        String[] grade = {
                "A", "A-",
                "B+", "B", "B-",
                "C+", "C", "C-",
        };
        int temp = 90;
        for (int i = 0; temp >= 55; i++, temp -= 5) {
            if (score >= temp) {
                return grade[i];
            }
        }
        if (score >= 53) return "D+";
        else if (score >= 52) return "D";
        else if (score >= 50) return "D-";
        return "F";
    }
}
