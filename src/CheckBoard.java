public class CheckBoard {
    public static void main(String[] args) {
        int size = 6;
        for (int count = 0; count < size; count++) {
            for (int counter = 0; counter < size; counter++) {
                if ((count + counter) % 2 == 0) {
                    System.out.print("*");
                }else  {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
