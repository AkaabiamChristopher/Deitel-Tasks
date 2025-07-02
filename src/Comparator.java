import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first integers you want to compare: ");
        double num1  = sc.nextDouble();

        System.out.println("Enter the second integers you want to compare: ");
        double num2  = sc.nextDouble();

        int result = compareNumbers(num1,num2);
        System.out.println("The result is: " + result);
    }
    public static int compareNumbers(double num1, double num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 < num2) {
            return 1;
        }else  {
            return -1;
        }
    }
}
