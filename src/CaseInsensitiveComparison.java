public class CaseInsensitiveComparison {

    public static void main(String[] args) {
        System.out.println(match("HeLlo", "heLLo"));
    }

    /* ===============================================================
    Write a function that validates whether two strings are identical.
    Make it case insensitive.

    // match("hello", "hELLo") ➞ true
    ================================================================= */
    public static boolean match(String str1, String str2) {
        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();
        if ( string1.equals(string2) ) {
            return true;
        }
        return false;
    }

}

