package eiu.cse104.midterm;

import java.util.Scanner;

public class RentTruck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dirtAmount = scanner.nextInt();

        int[] levels = {50, 42, 10, 8, 1};
        int[] truckTypes = {50, 50, 10, 10, 1};
        int[] truckCosts = {500, 500, 120, 120, 15};

        int totalCost = 0;

        for (int i = 0; i < levels.length; i++) {
            if (dirtAmount >= levels[i]) {
                int numOfTrucks = dirtAmount / levels[i];
                dirtAmount -= numOfTrucks * truckTypes[i];
                totalCost += numOfTrucks * truckCosts[i];
            }
        }

        System.out.println(totalCost);
    }
}
