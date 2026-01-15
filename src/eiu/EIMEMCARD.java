package eiu;

import java.io.PrintWriter;
import java.util.Scanner;

public class EIMEMCARD {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        int items = scanner.nextInt();
        long price = 0;
        long total = 0;
        double discount = 0;
        while (items-- > 0) {
            price = scanner.nextLong();
            out.print((price * discount) + " ");
            total += price;
            if (total >= 200_000_000) discount = 0.07;
            else if (total >= 50_000_000) discount = 0.05;
            else if (total >= 20_000_000) discount = 0.03;
            else if (total >= 1_000_000) discount = 0.02;
            else discount = 0.0;
        }
        out.flush();
    }
}
