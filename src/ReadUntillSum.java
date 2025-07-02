import java.lang.annotation.Target;
import java.util.Scanner;

public class ReadUntillSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a target number you want to sum: ");
        int num = sc.nextInt();

        int currentSum = 0;
        int count = 0;

        System.out.println("Enter number you want to sum: ");
        while(currentSum < num) {
            System.out.print("Enter number you want to sum: ");
            int number = sc.nextInt();
            currentSum += number;
            count++;
            System.out.println("current sum: " + currentSum);
        }
        System.out.println("Target sum reached: ");
        System.out.println("Total number entered: " + count);
        System.out.println("Final sum: " + currentSum);
    }
}
