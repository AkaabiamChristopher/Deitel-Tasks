
 import java.util.Scanner;

public class ArcheryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3]; 

        
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for Player Scores should between 1-9 " + (i + 1) + ":");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("Chance " + (j + 1) + ": ");
                scores[i][j] = scanner.nextInt();
                while (scores[i][j] < 0 || scores[i][j] > 10) {
                    System.out.print("Invalid score. Please enter a score between 0 and 10: ");
                    scores[i][j] = scanner.nextInt();
                }
            }
        }

 
        System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal Score");
        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < scores.length; i++) {
            int totalScore = scores[i][0] + scores[i][1] + scores[i][2];
            System.out.printf("%d\t%d\t%d\t%d\t%d%n", i + 1, scores[i][0], scores[i][1], scores[i][2], totalScore);
            if (totalScore > maxScore) {
                maxScore = totalScore;
                winner = i + 1;
            }
        }


        System.out.println("Player " + winner + " wins with a total score of " + maxScore);
    }
}