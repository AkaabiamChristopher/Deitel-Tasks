import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        int weightInPounds = scanner.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInInches = scanner.nextInt();

        double bmi = (703.0 * weightInPounds) / (heightInInches * heightInInches);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        System.out.println(" BMI Categories: ");
        System.out.println(" Underweight: BMI < 18.5 ");
        System.out.println(" Normal weight: BMI = 18.5-24.9 ");
        System.out.println(" Overweight: BMI = 25-29.9 ");
        System.out.println(" Obese: BMI >= 30 ");

        if (bmi < 18.5) {
            System.out.println(" You are underweight. ");
        } else if (bmi < 25) {
            System.out.println(" You are normal weight. ");
        } else if (bmi < 30) {
            System.out.println(" You are overweight. ");
        } else {
            System.out.println(" You are obese. ");
        }
    }
}