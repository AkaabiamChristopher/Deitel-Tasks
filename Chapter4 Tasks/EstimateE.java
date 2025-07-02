import java.util.Scanner;

public class EstimateE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms to calculate: ");
        int terms = scanner.nextInt();

        double e = 0.0;

        for (int i = 0; i < terms; i++) {
            e += 1.0 / calculateFactorial(i);
        }

        System.out.println("The estimated value of e is: " + e);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}