public class Pattern2{
    public static void main(String[] args) {
        for (int count = 0; count < 8; count++) {
            System.out.print(" ");
            for (int counter = 0; counter < 8 -count; counter++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= count; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}