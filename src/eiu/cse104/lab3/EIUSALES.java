package eiu.cse104.lab3;

import java.util.Scanner;

public class EIUSALES {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double money = scanner.nextDouble();
        System.out.println(Math.round(calculate(money) * 1000.0) / 1000.0);
    }

    static double calculate(double money) {
        double[] levels = {20, 30, 150, 300, 1500};
        double[] rates = {0.02, 0.03, 0.04, 0.05, 0.06};
        double reward = 0.0;
        for (int i = 0; i < levels.length; i++) {
            if (money > levels[i]) {
                reward += levels[i] * rates[i];
                money -= levels[i];
            } else {
                return reward + money * rates[i];
            }
        }
        reward += money * 0.07;
        return reward;
    }
}
