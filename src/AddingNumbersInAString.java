public class AddingNumbersInAString {

    public static void main(String[] args) {
        System.out.println(addNums("2,  5,  1,  8,  4"));
    }

    /* ======================================================
    Given a string of numbers separated by a comma and space,
    return the total sum of all the numbers.
    ======================================================== */

    // addNums("2,  5,  1,  8,  4") ➞ 20
    public static int addNums(String nums) {
        String[] arr = nums.split(", ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }

}

