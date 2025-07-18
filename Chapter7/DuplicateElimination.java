import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

       
        for (int count = 0; count < numbers.length; count++) {
            numbers[count] = -1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number between 10 and 100: ");
            int number = input.nextInt();

           
            while (number < 10 || number > 100) {
                System.out.print("Invalid input. Enter a number between 10 and 100: ");
                number = input.nextInt();
            }

            
            boolean duplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == number) {
                    duplicate = true;
                    break;
                }
            }

            
            if (!duplicate) {
                numbers[i] = number;
            } else {
                System.out.println("Duplicate number. Skipping...");
                i--; 
            }
        }

       
        System.out.println("Unique numbers:");
        for (int number : numbers) {
            if (number != -1) {
                System.out.print(number + " ");
            }
        }
    }
}