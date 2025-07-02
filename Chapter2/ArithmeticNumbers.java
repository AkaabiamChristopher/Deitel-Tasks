
import java.util.Scanner;

public class ArithmeticNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
