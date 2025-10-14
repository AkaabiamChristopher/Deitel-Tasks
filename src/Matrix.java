public class Matrix {
    public static void main(String[] args) {
                int number = 4;
                int[][] matrix = new int[number][number];
                int num = 1;
                int top = 0, bottom = number - 1, left = 0, right = number - 1;

                while (num <= number * number) {

                    for (int i = left; i <= right; i++) {
                        matrix[top][i] = num++;
                    }
                    top++;

                    for (int i = top; i <= bottom; i++) {
                        matrix[i][right] = num++;
                    }
                    right--;

                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = num++;
                    }
                    bottom--;

                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = num++;
                    }
                    left++;
                }

                for (int i = 0; i < number; i++) {
                    for (int j = 0; j < number; j++) {
                        System.out.printf("%2d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            }
        }


