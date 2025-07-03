package Chapter5;

public class StringToNumber {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
        }

        return sum == original;
    }
}
