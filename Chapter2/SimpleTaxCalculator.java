import java.util.Scanner;

public class SimpleTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int count = 1; count <= 3; count++) {
            System.out.print("Enter citizen's name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s earnings: ");
            double earnings = input.nextDouble();
            
            double tax;
            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = 30000 * 0.15 + (earnings - 30000) * 0.20;
            }

            System.out.println("Total tax for " + name + ": $" + tax);
            System.out.println();
        }

    
    }
}
