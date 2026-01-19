package eiu.cse104.lab1;

import java.util.Scanner;

public class EIINCRDES {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isIncreased = true;
        boolean isDecreased = true;
        int n = scanner.nextInt() - 1;
        int prev = scanner.nextInt();
        int next;

        while (n-- > 0 && (isIncreased || isDecreased)) {
            next = scanner.nextInt();
            if (prev <= next) {
                isDecreased = false;
            }
            if (prev >= next) {
                isIncreased = false;
            }
            prev = next;
        }

        if (isIncreased)
            System.out.println("increasing");
        else if (isDecreased)
            System.out.println("decreasing");
        else
            System.out.println("none");
    }

}
