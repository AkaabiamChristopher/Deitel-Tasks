import java.util.Scanner;

public class CalculationOfCycle{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the radius of the cycle");
    int radius = scanner.nextInt();

	System.out.printf("Diameter: %d%n", 2 * radius);
	System.out.printf("Circumference: %.2f%n", 2 * Math.PI * radius);
	System.out.printf("Area:2f%n",Math.PI * radius * radius);

	}
}