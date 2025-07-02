import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int integer = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number .");
        } else {
            int encryptedNumber = encrypt(number);
            System.out.println("The encrypted number is: " + encryptedNumber);
        }
    }

    public static int encrypt(int number) {
        String numStr = String.format("%04d", number);
        int[] digits = new int[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = (numStr.charAt(i) - '0' + 7) % 10;
        }

       
        int temp = digits[0];
        digits[0] = digits[2];
        digits[2] = temp;

        temp = digits[1];
        digits[1] = digits[3];
        digits[3] = temp;

        String encryptedStr = "";
        for (int digit : digits) {
            encryptedStr += digit;
        }

        return Integer.parseInt(encryptedStr);
    }
}