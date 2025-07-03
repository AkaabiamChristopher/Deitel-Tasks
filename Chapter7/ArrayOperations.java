public class ArrayOperations {
    public static void main(String[] args) {
      
        int[] counts = new int[30];
        for (int count = 10; count <= 20; count++) {
            counts[count] = 0;
        }

        int[] bonus = new int[20];
        for (int counter = 0; counter < bonus.length; counter++) {
            bonus[counter] *= 2;
        }

        int[] bestScores = {85, 90, 78, 92, 88, 75, 91, 83, 89, 95};
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}
