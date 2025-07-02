public class SumArray {
    public static void main(String[] args) {
        int[] array = {32,434,45,67,78,98,90,56};
        int sum = 0;

        for (int count = 0; count < array.length; count++) {
            sum += array[count];

        }
        System.out.println("The sum of Array is " + sum);
    }
}
