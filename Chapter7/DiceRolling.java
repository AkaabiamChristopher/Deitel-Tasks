import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sums = new int[13];

        for (int i = 0; i < 36_000_000; i++) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1; 
            int sum = die1 + die2; 
            sums[sum]++; 
        }

        
        System.out.println("Sum\tFrequency\tPercentage");
        for (int i = 2; i <= 12; i++) {
            double percentage = ((double) sums[i] / 36_000_000) * 100;
            System.out.printf("%d\t%,d\t%.2f%%%n", i, sums[i], percentage);
        }
    }
}