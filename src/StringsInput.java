

public class StringsInput {
    public static void main(String[] args) {
        char[] charArray = {'b','i','r','t','h',' ','d','a','y'};
        String index = new String("hello");

        String index1 = new String();
        String index2 = new String(index);
        String index3 = new String(charArray);
        String index4 = new String(charArray,6,3);
        System.out.printf("index1 = %s%nindex2= %s%nindex3= %s%nindex4= %s%n",index1,index2,index3,index4);
    }
}
