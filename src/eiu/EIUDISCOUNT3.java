package lab3;

import java.util.Scanner;

public class EIUDISCOUNT3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long bill = scanner.nextLong();
        
        long payment = calNoelDiscount(bill);

        payment = (long) (payment - payment * scanner.nextInt() * 0.02);
        payment = (long) (payment - payment * scanner.nextInt() * 0.02);
        payment = (long) (payment - payment * scanner.nextInt() * 0.02);

        System.out.println(payment);
    }

    static long calNoelDiscount(long bill) {
        long[] levels = {
            0, 5_000_000, 20_000_000, 100_000_000, 300_000_000, 600_000_000,
            900_000_000
        };
        int[] rates = {0, 3, 5, 7, 10, 12};

        long gap, remain = bill;
        long totalDiscount = 0;
        
        for (int i = 0; i < levels.length - 1; i++) {
            gap = levels[i + 1] - levels[i];
            if (remain > gap) {
                totalDiscount += gap * rates[i] / 100;
                remain -= gap;
            } else {
                totalDiscount += remain * rates[i] / 100;
                return bill - totalDiscount;
            }
        }
        totalDiscount += remain * 15 / 100;
        return bill - totalDiscount;
    }
}
