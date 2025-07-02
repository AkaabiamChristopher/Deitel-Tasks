import java.util.Scanner;

public class Multiples{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter integer");
     int num1 = scanner.nextInt();

    System.out.println("Enter integer");
     int num2 = scanner.nextInt();
    
    int tripledNum1 = num1 * 3;
    int doubledNum2 = num2 * 2;
  
    if(tripledNum1  % doubledNum2 == 0){
	System.out.println(tripledNum1 + " is a multiple of " + doubledNum2);
	}else{
	
	System.out.println(tripledNum1 + " is not a multiple of " + doubledNum2);
	}
     }
}
