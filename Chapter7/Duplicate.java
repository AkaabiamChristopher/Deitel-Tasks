import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + " (between 10 and 100): ");
            int num = input.nextInt();
            if (num < 10 || num > 100) {
                System.out.println("Number must be between 10 and 100. Try again.");
                i--;
                continue;
            }
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                numbers[count] = num;
                count++;
            }
        }
        System.out.println("\nNon duplicated n umbers entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
