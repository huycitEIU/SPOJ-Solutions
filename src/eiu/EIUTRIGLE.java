package eiu;

import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] edges = new int[n];
        for (int i = 0; i < n; i++) {
            edges[i] = scanner.nextInt();
        }

        Arrays.sort(edges);

        int count = 0;
        for (int a = 0; a < n - 2; a++) {
            for (int b = a + 1; b < n - 1; b++) {
                for (int c = b + 1; c < n && edges[c] < edges[a] + edges[b]; c++) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
