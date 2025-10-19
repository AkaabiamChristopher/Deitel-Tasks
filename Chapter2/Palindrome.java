import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a five-digit integer: ");
            int number = scanner.nextInt();

            if (number >= 10000 && number <= 99999) {
                int reversedNumber = reverseNumber(number);

                if (number == reversedNumber) {
                    System.out.println(number + " is a palindrome.");
                } else {
                    System.out.println(number + " is not a palindrome.");
                }
                break;
            } else {
                System.out.println("Please enter a five-digit integer.");
            }
        }
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return reversedNumber;
    }
}