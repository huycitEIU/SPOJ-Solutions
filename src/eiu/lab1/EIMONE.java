package eiu.lab1;

import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();

        int[] denominations = {20, 10, 5, 1};
        for (int d : denominations) {
            if (money >= d) {
                System.out.println(d + " " + money / d);
                money %= d;
            }
        }
    }
}
