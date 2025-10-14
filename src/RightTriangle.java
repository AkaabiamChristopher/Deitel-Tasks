import java.util.Scanner;

public class RightTriangle{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the base of a right angle triangle: ");
	int base = scanner.nextInt();

   for (int count = 10; count >= 1; count--) {
            for (int counter = 1; counter <= 10 - count; counter++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= count; k++) {
                System.out.print("*");
            }
           System.out.println();
   }

    }
}