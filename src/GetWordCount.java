public class GetWordCount {

    public static void main(String[] args) {
       countWords("There are seven words in this sentence.");
    }

    /* ============================================
    Create a method that takes a string and returns
    the word count. The string will be a sentence.
    ============================================== */

    public static int countWords(String s) {

        // Splitting the string around matches of the given regular expression
        String[] words = s.split("\\s+");

        // Return number of words in the given string
        return words.length;
    }

}
