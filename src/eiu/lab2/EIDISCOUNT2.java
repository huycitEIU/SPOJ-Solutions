package eiu.lab2;

import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        double[] moneys = {5, 20, 100, 300, 600, 900, Long.MAX_VALUE};
        double[] discounts = {0.03, 0.05, 0.07, 0.10, 0.12, 0.15};

        Scanner scanner = new Scanner(System.in);
        double bill = scanner.nextDouble();
        double totalDiscount = 0.0;
        for (int i = 0; i < moneys.length; i++) {
            if (bill > moneys[i] * 1_000_000f) {
                if (bill > moneys[i + 1] * 1_000_000f) {
                    totalDiscount += (moneys[i + 1] - moneys[i]) * 1_000_000f * discounts[i];
                } else {
                    totalDiscount += (bill - moneys[i] * 1_000_000f) * discounts[i];
                }
            }
        }
        System.out.println(Math.round(bill - totalDiscount));
    }
}
