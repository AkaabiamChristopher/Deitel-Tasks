public class Pattern2{
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) { 
            
            for (int counter = 1; counter <= 5  -count; counter++) {      
                System.out.print("  ");
            }
            for (int i = 1; i <= count; i++) {          
                System.out.print("* ");
            }
            System.out.println();                   
        }
    }
}