package Chapter5;

public class ReversedString {
    public static void main(String[] args) {
        String index1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("index1: %s",index1);

        System.out.printf("%nLenght of index1: %d",index1.length());
        System.out.printf("%nThe string reversed is: ");

        for(int counter = index1.length() -1;counter >= 0; counter--){
            System.out.print(index1.charAt(counter));
        }
        index1.getChars(0,5,charArray,0);
        System.out.printf("%nThe character array is: ");

        for(char character : charArray){
            System.out.print(character);
        }
        System.out.println();
    }
}
