public class MatchstickHouses {

    public static void main(String[] args) {
        System.out.println( matchHouses(4) );

    }

    // Create a function that takes a number (step)
    // as an argument and returns the number of matchsticks in that step.

    /* =====================================================
    Step 0 returns 0 matchsticks.
    The input (step) will always be a non-negative integer.
    Think of the input (step) as the total number of houses
    that have been connected together.
    ======================================================= */

    public static int matchHouses(int step) {
        if(step != 0){
            return (step * 5) + 1;
        }
        return 0;
    }

}
