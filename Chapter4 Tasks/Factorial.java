import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a nonnegative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a nonnegative integer.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}