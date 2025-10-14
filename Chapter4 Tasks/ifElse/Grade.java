
public class grade {

    public static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        int[] testScores = {95, 85, 75, 65, 55};
        for (int score : testScores) {
            System.out.println("Score: " + score + " -> Grade: " + getGrade(score));
        }
    }
}
