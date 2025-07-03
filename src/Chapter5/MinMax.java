package Chapter5;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("Enter a positive number of values: ");
            return;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < num; i++){
            System.out.println("Enter a value for "+(i+1)+": ");
            int value = sc.nextInt();

            if(value < min){
                min = value;
             }
            if(value > max){
                max = value;
            }
        }
       int sum = min + max;

        System.out.println("The maximun value is "+max);
        System.out.println("The minimum value is "+min);
        System.out.println("The sum value is "+sum);
    }
}
