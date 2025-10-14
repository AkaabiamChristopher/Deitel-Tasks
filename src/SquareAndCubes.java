public class SquareAndCubes {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for(int  count = 0; count <= 10; ++count) {
                    System.out.printf("%d\t%d\t%d%n", count, count * count, count * count * count);
        }
    }
}
