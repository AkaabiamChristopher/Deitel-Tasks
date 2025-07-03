import java.util.ArrayList;


public class MultiplyToProduct {
    public static void main(String[] args) {
        int product = 36;
        System.out.println(smallestNumber(product));
        System.out.println(solution(product));
    }
    public  static long smallestNumber(int product){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(product);

        for(int count = 9; count >= 2; count--){
            while(product % count == 0){
                product /= count;
            }
        }
        if(product != 1){
            return -1;
        }
        long result = 0;
        for(int digits: list){
            result += digits * 10L + digits;
        }
        return result;
    }

    public static long solution(int product){
        for(int count = 0; count < product; count++){
            for(int index = product; index > 0; index--){
                int result = count * index;
                if(result == product){
                    return result;
                }
            }
        }
        return 0;
    }
}
