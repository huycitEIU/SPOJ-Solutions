package eiu;

import java.util.Scanner;

/**
 * Class này dùng để kiểm thử các đoạn code đặc biệt.
 * Không phải solution.
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfEmployees = sc.nextInt();
        double totalSalaryOH = 0;
        double totalSalaryOT = 0;
        double totalOH = 0;
        double totalOT = 0;

        for (int i = 0; i < numOfEmployees; i++) {
            double[] hours = new double[5];
            for (int j = 0; j < hours.length; j++) {
                hours[j] = sc.nextDouble();
            }
            double hourlyWage = sc.nextDouble();
            double weeklyPay = 0;

            for (int j = 0; j < 5; j++) {
                double dailyHours = hours[j];

                // For each employee day
                double regularHours = Math.min(dailyHours, 8.0);
                double overtimeHours = Math.max(0.0, dailyHours - 8.0);
                double dailyPay = regularHours * hourlyWage + overtimeHours * hourlyWage * 1.5;

                weeklyPay += dailyPay;
                totalOT += overtimeHours;
                totalOH += regularHours;
                totalSalaryOH += regularHours * hourlyWage;
                totalSalaryOT += overtimeHours * hourlyWage * 1.5;
            }
            System.out.println(Math.round(weeklyPay * 100) / 100.0);

        }
        System.out.printf("%.2f\n", totalSalaryOH / totalOH);
        System.out.printf("%.2f", totalSalaryOT / totalOT);
    }
}
