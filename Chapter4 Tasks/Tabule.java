public class Tabule {
    public static void main(String[] args) {
        System.out.println("N\tN^2\tN^3\tN^4");

        for (int count = 1; count<= 5; count++) {
            int count2 = count * count;
            int count3 = count * count* count;
            int count4 = count2 * count2;  
            
            System.out.println(count + "\t" + count2 + "\t" + count3 + "\t" + count4);
        }
    }
}
