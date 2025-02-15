public class array1 {
    public static void main(String[] args) {
        int[] marks = { 19, 23, 14, 124, 224 };

        int[][] finalmarks = { { 97, 98, 99 }, { 23, 23, 43 }, { 45, 46, 47 } };

        System.out.println(finalmarks[1][2]);

        // casting
        // one type k data ko dusra type k data m change krna
        /*
         * implicit
         * double price = 100.00;
         * double finalprice = price + 18;
         * System.out.println(finalprice);
         * 
         * 
         * and explicit
         * int p = 100;
         * int fp = p + (int) 13.0;
         * System.out.println(fp);
         */
        // constant
        final int PI = 313;
    }
}
