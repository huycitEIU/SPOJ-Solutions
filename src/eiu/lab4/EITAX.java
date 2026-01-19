package eiu.lab4;

import java.util.Scanner;

public class EITAX {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(calculate(scanner.nextLong()));
    }

    private static long calculate(long salary) {
        long unit = 1_000_000L;

        long taxableIncome = salary - 9 * unit;
        if (taxableIncome <= 0) return 0;

        long[] levels = {5, 5, 8, 14, 20, 28};
        int[] rates = {5, 10, 15, 20, 25, 30, 35};

        long tax = 0;
        long level;

        for (int i = 0; i < levels.length; i ++) {

            level = levels[i] * unit;

            if (taxableIncome > level) {
                tax += level * rates[i] / 100;
                taxableIncome -= level;
            } else {
                tax += taxableIncome * rates[i] / 100;
                return tax;
            }
        }

        tax += taxableIncome * 35 / 100;

        return tax;
    }
}
