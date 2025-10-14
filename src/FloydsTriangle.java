public class FloydsTriangle{
    public static void main(String[] args) {
        int num = 1;
        int rows = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

}