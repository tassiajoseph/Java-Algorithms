public class ExistsANumberHigher {

    public static void main(String[] args) {
        existsHigher(new int[] {1, 2, 3, 4}, 6);
    }

    /* ==================================================
    Write a function that returns true if there exists at
    least one number that is larger than or equal to n.
    ===================================================== */

    public static boolean existsHigher(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            // matched numbers return true
            if (arr[i] >= n) {
                return true;
            }
        }
        // no matches found return false
        return false;
    }

}
