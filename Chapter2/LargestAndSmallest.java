import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter fourth integer: ");
        int number4 = scanner.nextInt();

        System.out.print("Enter fifth integer: ");
        int number5 = scanner.nextInt();

        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        if (number5 > largest) {
            largest = number5;
        }

        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number4 < smallest) {
            smallest = number4;
        }
        if (number5 < smallest) {
            smallest = number5;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
