public class Shape4{
public static void main(String[] args){

 for (int count = 10; count >= 1; count--) {
            for (int counter = 1; counter <= 10 - count; counter++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= count; k++) {
                System.out.print('0');
            }
           System.out.println();
        }
    }
}