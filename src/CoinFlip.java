import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a guess 0 For Head 1 For Tail: ");
        int guess = scanner.nextInt();


        int coinFlip = r.nextInt(0,1);
        String result = coinFlip == 0 ? "Head" : "Tail";
        String choice =  guess == 0 ? "Head" : "Tail";

        System.out.println(result);
        System.out.println(choice);

        if (result == choice) {
            System.out.println("You guess is correct");
        }else {
            System.out.println("You guess is incorrect");
        }

    }
}
