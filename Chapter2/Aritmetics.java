import java.util.Scanner;

public class Aritmetics{
   public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first integer: ");
      int number1 = scanner.nextInt();
    System.out.println("Enter second integer: ");
      int number2 = scanner.nextInt();
	
	int square1 = number1 * number1;
	int square2 = number2 * number2;
	
	int sumOfSquares = square1 + square2;
	int differenceOfSquares = square1 - square2;

	System.out.println("Square of " + number1 + " is " + square1);	 
	System.out.println("Square of " + number2 + " is " + square2);	
	System.out.println("Sum of square is" +  sumOfSquares);	  
 	System.out.println("difference of square is" +  differenceOfSquares);	  
 


	}

}