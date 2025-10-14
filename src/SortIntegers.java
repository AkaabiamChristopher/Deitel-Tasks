import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("Enter an integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter an integer: ");
        int num3 = scanner.nextInt();

        int [] numbers = {num, num2, num3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
