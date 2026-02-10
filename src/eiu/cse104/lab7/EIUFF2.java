package eiu.cse104.lab7;

import java.util.Scanner;

public class EIUFF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double interestRate = scanner.nextDouble() / 100.0;
        double inflationRate = scanner.nextDouble() / 100.0;
        double basedExpense = scanner.nextDouble();

        double principal = basedExpense / (interestRate - inflationRate);

        System.out.println((long) Math.ceil(principal));
    }
}
