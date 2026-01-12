package eiu;

import java.util.Scanner;

public class EIEVERYN {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        int m, n;

        while (t-- > 0) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            String result = check(m, n) ? "Yes" : "No";
            System.out.println(result);
        }
    }

    private static boolean check(int m, int n) {
        boolean[] flags;
        flags = new boolean[n + 1];
        flags[0] = true;
        for (int i = 0; i < m; i++) {
            int temp = scanner.nextInt();
            if (temp >= 1 && temp <= n) {
                flags[temp] = true;
            }
        }
        for (boolean flag : flags) {
            if (!flag) return false;
        }
        return true;
    }
}
