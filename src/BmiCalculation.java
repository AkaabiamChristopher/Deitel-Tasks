import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in kilograms");
        double height = scanner.nextDouble();

        double  bmi = weight * 703 / height * height;

        System.out.println("BMI is " + bmi);
        System.out.println("Your Weight is " + weight);
        System.out.println("Your Height is " + height);
    }
}
