
public class SingleDigit {

    public static String digitToWord(int digit) {
        if (digit == 0) {
            return "zero";
        }
        if (digit == 1) {
            return "one";
        }
        if (digit == 2) {
            return "two";
        }
        if (digit == 3) {
            return "three";
        }
        if (digit == 4) {
            return "four";
        }
        if (digit == 5) {
            return "five";
        }
        if (digit == 6) {
            return "six";
        }
        if (digit == 7) {
            return "seven";
        }
        if (digit == 8) {
            return "eight";
        }
        if (digit == 9) {
            return "nine";
        }
        return "invalid";
    }

    public static void main(String[] args) {

        System.out.println(digitToWord(3));
        System.out.println(digitToWord(9));
        System.out.println(digitToWord(12));
    }
}
