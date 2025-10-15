import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (1 to quit): ");
            int accountNumber = scanner.nextInt();

            if (accountNumber == 1) {
                break;
            }

            System.out.print("Enter balance at the beginning of the month: ");
            int beginingBalance = scanner.nextInt();

            System.out.print("Enter total of all items charged: ");
            int charges = scanner.nextInt();

            System.out.print("Enter total of all credits applied: ");
            int credits = scanner.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = scanner.nextInt();
	
            int newBalance = beginingBalance + charges - credits;
            System.out.printf("New balance: %d%n", newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }
        }
    }
}