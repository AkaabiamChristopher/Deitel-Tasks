import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double currentPopulation = scanner.nextDouble();

        System.out.print("Enter the annual world population growth rate (in %): ");
        double growthRate = scanner.nextDouble() / 100;

        System.out.println("Estimated world population for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            double newPopulation = currentPopulation * Math.pow(1 + growthRate, year);
            System.out.printf("Year %d: %.2f billion%n", year, newPopulation / 1e9);
        }
    }
}