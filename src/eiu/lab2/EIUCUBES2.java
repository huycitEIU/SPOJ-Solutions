package eiu.lab2;

import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- > 0) {
            System.out.print(layers(scanner.nextLong()) + " ");
        }
    }
    static long layers(long bricks) {
        /*
        bricks = layers * (layers + 1) * (layers + 2) / 6
         */
        long k = bricks * 6;
        long layers = (long) Math.cbrt(k);
        return (layers * (layers + 1) * (layers + 2) / 6 <= bricks) ? layers : layers - 1;
    }
}
