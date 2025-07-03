package Chapter5;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("num\t Sum");

        for(int count=1; count <= 100; count++){
            long sum = calculateSum(count);
            System.out.println(count+ " \t " +sum);
        }
    }
    public static long calculateSum(long n){
        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
