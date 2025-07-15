import java.util.Scanner;

public class PointDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first X point:");
        double x1 = sc.nextDouble();
        System.out.println("Enter the first Y point:");
        double y1 = sc.nextDouble();
        System.out.println("Enter the second X point:");
        double x2 = sc.nextDouble();
        System.out.println("Enter the second Y point:");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1,y1,x2,y2);
        System.out.println("The distance between points is: " + distance);
        if(x1 == x2){
            System.out.println("The distance between points is equal");
        }else if(y1 == y2){
            System.out.println("The distance between points is equal");
        }else {
            System.out.println("The distance between points is not equal");
        }

    }
public static double calculateDistance(double x1,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
}
}
