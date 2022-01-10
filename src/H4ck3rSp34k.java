public class H4ck3rSp34k {

    public static void main(String[] args) {
        System.out.println(hackerSpeak("javascript is cool"));
    }

    /*
Create a function that takes a string as an argument and returns
a coded (h4ck3r 5p34k) version of the string.

//In order to work properly, the function should replace all
"a"s with 4, "e"s with 3, "i"s with 1, "o"s with 0, and "s"s with 5.
*/

    // hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"
    public static String hackerSpeak(String str) {
        int letterNumA = 4;
        int letterNumE = 3;
        int letterNumI = 1;
        int letterNumO = 0;
        int letterNumS = 5;
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                newString += letterNumA;
            }
            else if (str.charAt(i) == 'e') {
                newString += letterNumE;
            }
            else if (str.charAt(i) == 'i') {
                newString += letterNumI;
            }
            else if (str.charAt(i) == 'o') {
                newString += letterNumO;
            }
            else if (str.charAt(i) == 's') {
                newString += letterNumS;
            }
            else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }

}






