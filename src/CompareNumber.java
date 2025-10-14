import java.util.Scanner;

public class CompareNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an inteeger ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Number: " + number);
        System.out.println("Square: " + square);

        if(number > 100){
            System.out.println(number + " Is greater than 100");
        } else if(number <100){
            System.out.println(number + " Is less than 100");
        }

        if(square > 100){
            System.out.println(square + " Is greater than 100");
        } else if (square <100){
            System.out.println(square + " Is less than 100");
        } else{
            System.out.println(square + " Is equal to 100");
        }

    }
}