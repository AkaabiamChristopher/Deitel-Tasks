import java.util.Scanner;
public class TraficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter colour (red,green,yellow):");
        String colour = sc.nextLine().intern();

        if (colour == "red"){
            System.out.println("stop");
        } else if (colour == "yellow") {
            System.out.println("get ready");
        } else if (colour == "green") {
            System.out.println("go");
        
        }
    }
}