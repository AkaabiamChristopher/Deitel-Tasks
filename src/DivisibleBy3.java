import java.util.Scanner;

public class DivisibleBy3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter integer");
     int num = scanner.nextInt();

    if(num % 3 == 0){
	System.out.print(num + " is divisible by 3");
     }else{
	System.out.print(num + " is not divisible by 3"); 
    }
  }
}


