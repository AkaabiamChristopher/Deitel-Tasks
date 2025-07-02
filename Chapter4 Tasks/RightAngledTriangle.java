import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the length of the base (1-10): ");
            int baseLength = scanner.nextInt();

            if (baseLength >= 1 && baseLength <= 10) {
                for (int i = 1; i <= baseLength; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}