import java.util.Scanner;

public class NumberCounter {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      int negatives = 0;
      int positives = 0;
      int zeros = 0;

      for (int i = 0; i < 5; i++) {
        System.out.print("Enter a number: ");
          int number = scanner.nextInt();

           if (number < 0) {
              negatives++;
            } else if (number > 0) {
                positives++;
            } else {
                zeros++;
            }
        }

        System.out.println("Number of negative numbers: " + negatives);
        System.out.println("Number of positive numbers: " + positives);
        System.out.println("Number of zeros: " + zeros);
    }
}

