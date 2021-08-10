package Practice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        String str = "Hello World";
        int strlength = str.length();
        int lastIndex = strlength - 1;
        System.out.println(str.charAt(lastIndex));

        System.out.println(str.charAt(str.length()-1));

        double [] topBills = new double[5];

        topBills[0] = 23.32;
        topBills[1] = 10;
        topBills[3] = 22.2;
        topBills[2] = 98.76;
        topBills[4] = topBills[2] + topBills[3];
        System.out.println("topBills array --> " + Arrays.toString(topBills));
        //store the value of at index-2 in new variable (foodBill)
        double foodBill = topBills[2];

        // change the value at index-3
        // new value should be the average of values at index-0 and index-1

        topBills[3] = (topBills[0] + topBills[1]) / 2;

        System.out.println("topBills array -->" + Arrays.toString(topBills));

        /**
         * To find the length of array
         *
         * length  <-- In array
         */


    }
}
