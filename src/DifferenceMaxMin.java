import java.util .*;

public class DifferenceMaxMin {

    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[] {1, 2, 3, 4, 5}));
    }


    /* ===================================================
    Create a function that takes an array and returns
    the difference between the biggest and smallest numbers.

    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
    // Smallest number is -50, biggest is 32.

    differenceMaxMin([44, 32, 86, 19]) ➞ 67
    // Smallest number is 19, biggest is 86.
    ======================================================== */

    // solution #1
    /*
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
    */

    // solution #2
    public static int differenceMaxMin(int[] arr) {
        // initialize max and min variables
        int max = arr[0];
        int min = arr[0];

        // loop over every index in arr
        for (int i = 0; i < arr.length; i++) {

            // set the max number to the max variable
            if (arr[i] > max) {
                max = arr[i];
            }

            // set the min number to the max variable
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // subtract min from max
        return max - min;
    }
}