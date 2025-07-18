public class Average{
   public static void main(String[] args){
	System.out.printf("Average of 10,20,30: %.2f%n", average(10,20,30));
	System.out.printf("Average of 1,2,3,4,5: %.2f%n", average(1,2,3,4,5));
	System.out.printf("Average of 100,200: %.2f%n", average(100,200));
	System.out.printf("Average of 50: %.2f%n", average(50));
}
   public static double average(int... numbers){
	int sum = 0;
	for(int number: numbers){
	   sum += number;
	}
	return(double) sum / numbers.length;
}
}