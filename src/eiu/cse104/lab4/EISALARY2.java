package eiu.cse104.lab4;

import java.util.Scanner;

public class EISALARY2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int employees = scanner.nextInt();
        Worker worker;

        double totalOfficialSalary = 0.0;
        double totalOfficialHours = 0.0;

        double totalOvertimeSalary = 0.0;
        double totalOvertime = 0.0;

        while (employees-- > 0) {
            worker = new Worker();

            totalOfficialHours += worker.officialHours;
            totalOvertime += worker.overtime;
            totalOfficialSalary += worker.officialSalary;
            totalOvertimeSalary += worker.overtimeSalary;

            System.out.println(round(worker.totalSalary));
        }

        System.out.println(round(totalOfficialSalary / totalOfficialHours));
        System.out.println(round(totalOvertimeSalary / totalOvertime));
    }

    private static double round(double num) {
        return Math.round(num * 100.0) / 100.0;
    }

    private static class Worker {
        double officialHours = 0.0;
        double overtime = 0.0;
        double wagePerHour;
        double officialSalary;
        double overtimeSalary;
        double totalSalary;

        public Worker() {
            double hours;
            for (int i = 0; i < 5; i++) {
                hours = scanner.nextDouble();

                if (hours > 8.0) {
                    officialHours += 8.0;
                    overtime += hours - 8.0;
                } else {
                    officialHours += hours;
                }
            }
            wagePerHour = scanner.nextDouble();

            officialSalary = officialHours * wagePerHour;
            overtimeSalary = overtime * wagePerHour * 1.5;
            totalSalary = officialSalary + overtimeSalary;
        }
    }
}
