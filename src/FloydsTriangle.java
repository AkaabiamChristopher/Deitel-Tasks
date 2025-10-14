public class FloydsTriangle{
    public static void printFloydsTriangle(int rows) {
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydsTriangle(5);
    }
}