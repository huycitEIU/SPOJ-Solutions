package eiu.lab1;

import java.util.Scanner;

public class EIUTHU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPart = scanner.next();
        String secondPart = scanner.next();
        scanner.close();

        char[] first = firstPart.toCharArray();
        char[] second = secondPart.toCharArray();

        int maxCount = 0;

        for (int i = 0; i < first.length; i++) {
            int count = 0;
            while (i + count < first.length
                    && count < second.length
                    && first[i + count] == second[count]) {
                count++;
            }
            if (i + count == first.length)
                maxCount = Math.max(maxCount, count);
        }

        System.out.println(first.length + second.length - maxCount);
    }
}
