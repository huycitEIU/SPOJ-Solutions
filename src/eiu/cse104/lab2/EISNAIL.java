package eiu.cse104.lab2;

import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long V = scanner.nextLong();

        long AB = A - B;
        long days = (long) Math.ceil((V - A) / (double) AB) + 1;
        System.out.println(days);
    }
}