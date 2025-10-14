import java.util.Scanner;

public class DivisibleByBoth{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter an integer");
	int number = scanner.nextInt();

	
	System.out.println(number % 5 == 0 && number % 6 == 0);
	System.out.println((number % 5 == 0) != (number % 6 == 0));
 


	
}
}