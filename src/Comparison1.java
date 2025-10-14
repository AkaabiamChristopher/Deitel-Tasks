
import java.util.Scanner;
public class Comparison1{
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second Number: ");
        int number2 = scanner.nextInt();

        if(number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
	 if(number1 != number2){
            System.out.printf("%d == %d%n", number1, number2);

        } if(number1 < number2){
            System.out.printf("%d == %d%n", number1, number2);

        } if(number1 > number2){
            System.out.printf("%d == %d%n", number1, number2);

        } if(number1 <= number2){
            System.out.printf("%d == %d%n", number1, number2);

        } if(number1 >= number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
    }
}