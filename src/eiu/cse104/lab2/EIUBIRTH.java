package eiu.cse104.lab2;

import java.util.Scanner;

public class EIUBIRTH {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testcase = scanner.nextInt();

        long bluePresents, redPresents;
        long bluePrice, redPrice, tranferPrice;

        long minBluePrice, minRedPrice, payment;

        while (testcase-- > 0) {
            bluePresents = scanner.nextLong();
            redPresents = scanner.nextLong();

            bluePrice = scanner.nextLong();
            redPrice = scanner.nextLong();
            tranferPrice = scanner.nextLong();

            minBluePrice = Math.min(bluePrice, redPrice + tranferPrice);
            minRedPrice = Math.min(redPrice, bluePrice + tranferPrice);

            payment = minBluePrice * bluePresents + minRedPrice * redPresents;

            System.out.println(payment);
        }
    }
}
