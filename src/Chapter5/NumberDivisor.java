package Chapter5;

public class NumberDivisor {
    public static void main(String[] args) {
        int [] number = {21,3,55,4,5};
        int divisor = 2;
//        int array = getDivisors(number,array);
        System.out.println("Divisor of " + number + "in the array is: " + divisor);
        for (int i = 1; i <= divisor; i++) {
            System.out.println(divisor);
        }

    }

    public static int[] getDivisors(int[] array, int[] number) {
        int count = countOfDivisors(array,number);
        int[] result = new int[count];
        int currentResult = 0;
        for (int i = 1; i <= count; i++) {
            if (array[i - 1] == number[i - 1]) {
                currentResult++;
            }
        }
        return result;
    }
    private static int countOfDivisors(int[] array, int[] number) {
        int count = 0;
        for (int i = 1; i <= array.length; i++) {
            if (array[i - 1] == number[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
