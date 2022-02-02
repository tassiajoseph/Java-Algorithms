public class ConvenienceStore {

    public static void main(String[] args) {
        System.out.println(changeEnough(new int[]{25, 20, 5, 0}, 4.25));
    }

    /* ===========================================================
    Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.

    To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.
    ============================================================= */

    public static boolean changeEnough(int[] change, double amountDue) {
        double totalChange = 0;
        totalChange += change[0]*.25;
        totalChange += change[1]*.10;
        totalChange += change[2]*.05;
        totalChange += change[3]*.01;
        if (totalChange >= amountDue) {
            return true;
        }
        return false;
    }

}



