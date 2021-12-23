public class HowManyVowels {

    public static void main(String[] args) {
        getCount("Celebration");
    }

    /* ===================================================
    Create a function that takes a string and returns the
    number (count) of vowels contained within it.
    ===================================================== */

    public static int getCount(String str) {
        int vowelsCount = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}



