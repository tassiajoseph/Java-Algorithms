public class CountSyllables {

    public static void main(String[] args) {
        System.out.println(numberSyllables("buf-fet"));
    }


    /* ==============================================================
    Create a function that counts the number of syllables a word has.
	Each syllable is separated with a dash -.
	================================================================ */

    public static int numberSyllables(String word) {
        int count = 1;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == '-') count++;
        }
        return count;
    }

}
