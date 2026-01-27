package eiu.cse104.lab5;

import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long money = sc.nextLong();
        long discount = money / 100 * 30;

        discount = (discount > 50_000) ? 50_000 : discount;

        System.out.println(money - discount);
    }
}
