import java.util.Scanner;

public class GreatPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the estimated number of stones used: ");
        int stonesUsed = scanner.nextInt();

        System.out.print("Enter the average weight of each stone (in tons): ");
        double stoneWeight = scanner.nextDouble();

        System.out.print("Enter the number of years taken to build the pyramid: ");
        int yearsTaken = scanner.nextInt();

        double totalWeight = stonesUsed * stoneWeight;
        double weightPerYear = totalWeight / yearsTaken;
        double weightPerHour = weightPerYear / (365 * 24);
        double weightPerMinute = weightPerHour / 60;

        System.out.printf("Estimated total weight of the pyramid: %.2f million tons%n", totalWeight / 1e6);
        System.out.printf("Estimated weight built per year: %.2f thousand tons%n", weightPerYear / 1e3);
        System.out.printf("Estimated weight built per hour: %.2f tons%n", weightPerHour);
        System.out.printf("Estimated weight built per minute: %.2f tons%n", weightPerMinute);
    }
}