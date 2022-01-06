public class VideoLengthInSeconds {

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("10:38"));
    }

    /* ====================================================================
    You are given the length of a video in minutes.
    The format is mm:ss (e.g.: "02:54").
    Create a function that takes the video length and return it in seconds.
    If the number of seconds is 60 or over, return -1.
    ======================================================================= */

    // minutesToSeconds("01:00") ➞ 60
    public static int minutesToSeconds(String tm) {
        // "1:00" split at the ":"
        String[] arr = tm.split(":"); // 2 index array
        int minutes = Integer.parseInt(arr[0]); // parse the minutes
        int seconds = Integer.parseInt(arr[1]); // parse the seconds

        // If the number of seconds is 60 or over, return -1.
        if (seconds >= 60) {
            return -1;
        }

        // If not met return mins into seconds
        return (minutes * 60) + seconds;

    }
}
