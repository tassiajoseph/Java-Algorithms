public class ReverseTheNumber {

    public static void main(String[] args) {
        System.out.println(rev(1234));
    }

    // Create a function that takes an integer n and reverses it.
    // If the number is negative, treat it like it's positive.

    public static String rev(int n) {
        // turn the int into a String
        String nString = Integer.toString(n);
        String result = ""; // "4", "43", "432", "4321"
        // loop backwards
        for (int i = nString.length() - 1; i >= 0; i--) {
            // append each stringified digit to the result
            // convert a character to a String value
            result += String.valueOf(nString.charAt(i));
        }

        if (n < 0) {
            // "4321-"
            return result.substring(0, result.length() - 1);
        }

        return result;

    }

}