
public class Equalitera {

    public static String triangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {

        System.out.println(triangleType(3, 3, 3));
        System.out.println(triangleType(3, 3, 2));
        System.out.println(triangleType(3, 4, 5));
    }
}
