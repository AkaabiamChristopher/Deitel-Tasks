import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 0;
        int secondLargest = 0;

        for(int count = 1; count <= 10; count++) {
            System.out.print("Enter number " + count + ": ");
            int number = sc.nextInt();

            if(number > largest) {
                secondLargest = largest;
                largest = number;
            }else if(number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
