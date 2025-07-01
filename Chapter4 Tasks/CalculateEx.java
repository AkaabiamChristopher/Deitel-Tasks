import java.util.Scanner;

public class CalculateEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms to calculate: ");
        int terms = scanner.nextInt();

        double ex = 0.0;

        for (int i = 0; i < terms; i++) {
            ex += Math.pow(x, i) / calculateFactorial(i);
        }

        System.out.println("The value of e^x is: " + ex);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}