package eiu.cse104.lab2;

import java.util.Scanner;

public class EIUFING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        index = (index - 1) % 18;
        if (index >= 10) {
            index = 18 - index;
        }
        String[] Y = {"cai", "tro", "giua", "ap ut", "ut", "ut", "ap ut", "giua", "tro", "cai"};
        String[] Z = {"trai", "phai"};

        int z = (index < 5) ? 0 : 1;

        System.out.println("Ngon " + Y[index] + " cua ban tay " + Z[z]);
    }
}
