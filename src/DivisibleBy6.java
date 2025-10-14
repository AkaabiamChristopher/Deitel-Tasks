import java.util.Scanner;
public class DivisibleBy6{
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if(number % 6 == 0){
            System.out.print("Number is divisible by 6");
        }else{
            System.out.print("Number is not divisible by 6");
        }
    }
}