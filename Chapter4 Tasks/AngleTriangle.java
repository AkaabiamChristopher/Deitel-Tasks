import java.util.Scanner;

public class AngleTriangle{
   public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the base of a right angle triangle");
	int baseLenght = scanner.nextInt();
 
	if(baseLenght >= 1 && baseLenght <= 10){
	for(int count =  1; count <= baseLenght; count++){
	 for(int counter = 1; counter <= count; counter++){
		System.out.print("* ");
	}
		System.out.println();
   	    }
	
	}else{
		System.out.println("Invalid input. Base lenght should be between 1 and 10 ");
	}
	  
	
   }

}