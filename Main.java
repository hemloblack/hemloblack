import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstNames = new String[2];
        String[] lastNames = new String[2];
        int[] hireYears = new int[2];
        String[] departments = new String[2];
        double[] salaries = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            firstNames[i] = scanner.nextLine();
            System.out.print("Last Name: ");
            lastNames[i] = scanner.nextLine();
            System.out.print("Year : ");
            hireYears[i] = scanner.nextInt();
            System.out.print("Department: ");
            scanner.nextLine();
            departments[i] = scanner.nextLine();
            System.out.print("hoghogh: ");
            salaries[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\n year in 1372:");
        for (int i = 0; i < 2; i++) {
            if (hireYears[i] == 1372) {
                System.out.println(firstNames[i] + " " + lastNames[i]);
            }
        }

        System.out.println("\nEmployees in it or mali departments:");
        for (int i = 0; i < 2; i++) {
            if (departments[i].equalsIgnoreCase("it") || departments[i].equalsIgnoreCase("mali")) {
                System.out.println(firstNames[i] + " " + lastNames[i]);
            }
        }

        System.out.println("\nEmployees with last name Kazemi:");
        for (int i = 0; i < 2; i++) {
            if (lastNames[i].equalsIgnoreCase("Kazemi")) {
                System.out.println(firstNames[i] + " " + lastNames[i]);
            }
        }

        System.out.println("\nSalaries above 23700 after 7% deduction:");
        for (int i = 0; i < 2; i++) {
            if (salaries[i] > 23700) {
                double deductedSalary = salaries[i] * 0.07;
                System.out.println(firstNames[i] + " " + lastNames[i] + ": Original Salary: " + salaries[i]
                        + ", Deducted Salary: " + deductedSalary);
            }
        }

        scanner.close();
    }
}
