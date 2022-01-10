public class TwoMakesTen {

    public static void main(String[] args) {
        System.out.println(makesTen(10, 11));
    }

    /* =================================================
    Create a function that takes two arguments.
    Both arguments are integers, a and b.
    Return true if one of them is 10 or if their sum is 10.
    ======================================================= */

    public static boolean makesTen(int a, int b) {
        if (a + b == 10 || a == 10 || b == 10) {
            return true;
        }
        return false;
    }

}


