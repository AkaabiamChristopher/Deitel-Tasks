import java.util.Scanner;

public class BinaryToDecima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary integer: ");
        int binaryNumber = scanner.nextInt();

        int decimalNumber = 0;
        int base = 1;

        while (binaryNumber > 0) {
            int digit = binaryNumber % 10;

            if (digit != 0 && digit != 1) {
                System.out.println("Invalid binary number.");
                return;
            }

            decimalNumber += digit * base;
            binaryNumber /= 10;
            base *= 2;
        }

        System.out.println("The decimal equivalent is: " + decimalNumber);
    }
}