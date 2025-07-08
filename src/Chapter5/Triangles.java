package Chapter5;

public class Triangles {
    public static void main(String[] args) {

        System.out.println("Pattern 1:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
           System.out.println();
        }


        System.out.print("\nPattern 2:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            //System.out.println();
        }


        System.out.print("\nPattern 3:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.print("\nPattern 4:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
           System.out.println();
        }
    }
}
