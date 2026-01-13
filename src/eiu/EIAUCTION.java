package lab3;

import java.util.Scanner;

public class EIAUCTION {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = scanner.nextInt();
        int[] rolls = new int[amount + 1];
        int[] dies = new int[7];

        for (int i = 1; i <= amount; i++) {
            rolls[i] = scanner.nextInt();
            dies[rolls[i]]++;
        }

        int index = 0;

        for (int i = 0; i < amount; i++) {
            if (dies[rolls[i]] == 1 && rolls[index] < rolls[i]) {
                index = i;
            }
        }

        if (index == 0) {
            System.out.println("none");
        } else {
            System.out.println(index);
        }
    }
}
