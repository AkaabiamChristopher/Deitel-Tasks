import java.util.Scanner;

public class Arithmetics{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int sumOfSquare = square1 + square2;
        int differenceOfSquare = square1 - square2;

        System.out.println("Square of num1 is: " + square1);
        System.out.println("Square of numb2 is: " + square2);
        System.out.println("Sum of square is: " + sumOfSquare);
        System.out.println("Difference of square is: " + differenceOfSquare);
    }
}