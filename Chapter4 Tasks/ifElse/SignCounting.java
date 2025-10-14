
public class SignCounting {

    public static char productSign(int a, int b, int c) {
        int negativeCount = 0;
        if (a < 0) {
            negativeCount++;
        }
        if (b < 0) {
            negativeCount++;
        }
        if (c < 0) {
            negativeCount++;
        }
        if (a == 0 || b == 0 || c == 0) {
            return '0';
        }
        return (negativeCount % 2 == 0) ? '+' : '-';
    }

    public static void main(String[] args) {

        System.out.println(productSign(2, 3, 4));
        System.out.println(productSign(-2, 3, 4));
        System.out.println(productSign(-2, -3, 4));
        System.out.println(productSign(-2, -3, -4));
        System.out.println(productSign(0, 3, 4));
    }
}
