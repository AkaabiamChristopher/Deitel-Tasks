public class ConvertToNumber {
    public static void main(String[] args) {
        String sentence = "Ade is going to Semicolon for a transformation "   ;
        System.out.println(findLargestWord(sentence));
    };

    public static String findLargestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}