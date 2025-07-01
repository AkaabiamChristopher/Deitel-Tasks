import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            if (counter == 1 || number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        
    }
}
