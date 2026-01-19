package eiu.cse104.lab3;

import java.util.Scanner;

public class EIUCHRMS {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int bills = SCANNER.nextInt();
        long income = 0;

        while (bills-- > 0) {
            income += calculate(SCANNER.nextLong());
        }
        System.out.println(income);
    }

    private static long calculate(long invoice) {
        long[] levels = {0, 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000};
        int[] discountRates = {3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = levels.length - 1; i >= 0; i--) {
            if (invoice > levels[i]) {
                return invoice - invoice * discountRates[i] / 100;
            }
        }
        return invoice;
    }
}
