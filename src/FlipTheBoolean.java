public class FlipTheBoolean {

    public static void main(String[] args) {
        reverse(true);
    }

    // Create a function that reverses a boolean value.

    public static boolean reverse(boolean b) {

        // solution #1
        if (b == true) {
            return false;
        } else {
            return true;
        }

        // solution #2
        // return !b;

    }

}
