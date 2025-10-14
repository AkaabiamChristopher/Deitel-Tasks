public class Multiplication {
    public static void main(String[] args) {
        int row = 20;
        System.out.println("Multiplication Table " + row + ":\n");

        System.out.print("    ");
        for (int count = 1; count <= row; count++) {
            System.out.printf("%4d", count);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");

        for (int count = 1; count <= row; count++) {
            System.out.printf("%2d |", count);
            for (int counter = 1; counter <= row; counter++) {
                System.out.printf("%4d", count * counter);
            }
            System.out.println();
        }
    }
}
