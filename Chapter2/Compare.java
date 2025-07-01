import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int num = Scanner.nextInt();

        int square = num * num;

        System.out.println("Number: " + num);
        System.out.println("Square: " + square);

        if(num >100) {
            System.out.println(num + " is greater than 100");
        } else if (num < 100){
            System.out.println(num + " is less than 100");
        }

        if(square >100){
            System.out.println(square + " is greater than 100");
        }else if (square <100){
            System.out.println(square + " is greater than 100");
        }else{
            System.out.println(square + " is equal To 100");
        }

    }
}