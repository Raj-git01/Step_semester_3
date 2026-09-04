public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            StringBuilder reversedWord = new StringBuilder(words[w]);
            reversedWord.reverse();
            result.append(reversedWord);
            if (w != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseEachWord("hello club")); // olleh bulc
    }
}
