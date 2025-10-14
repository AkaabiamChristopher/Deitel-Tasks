import java.util.Scanner;

public class BmiCalculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds");
        double weightInPounds = scanner.nextDouble();

        System.out.println("Enter height in Inches");
        double heightInInches = scanner.nextDouble();

        double  bmi = weightInPounds * 703 / heightInInches * heightInInches;
        
        System.out.println("Your Weight in pounds is: " + weightInPounds);
	System.out.println("You height in inches is :" + heightInInches);
	System.out.println("Your BMI is: " + bmi);
    }
}
