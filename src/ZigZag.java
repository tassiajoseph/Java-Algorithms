import java.util.ArrayList;

public class ZigZag {

    public static void main(String[] args) {

        int a[][] = {{ 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 }, { 13, 14, 15, 16 }};

        ArrayList<Integer> list = new ArrayList<Integer>();

        // {1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12}

        for(int i = 0; i < a.length; i++) { // row

            // if reading row 1 reverse order
            if (i % 2 != 0) {
                for(int j = a[i].length - 1; j >= 0; j--){ // column
                    // System.out.println(a[i][j]);
                    list.add(a[i][j]);
                }

            } if (i % 2 == 0) {
                for(int j = 0; j < a[i].length; j++){ // column
                    // System.out.println(a[i][j]);
                    list.add(a[i][j]);
                }
            } //end else
        }

        System.out.println(list);
    }

}
