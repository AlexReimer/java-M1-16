package lesson12;

public class HomeWork12 {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));// →true
        System.out.println(inOrder(1, 2, 1, false));// →false
        System.out.println(inOrder(1, 1, 2, true));// →true
        split();
        System.out.println(lessBy10(5, 7, 115));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        split();
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
        System.out.println(endsLy("dramatically"));// → true
        split();
        System.out.println(middleThree("Candy"));// →"and"
        System.out.println(middleThree("and"));// →"and"
        System.out.println(middleThree("solving"));// →"lvi"
        System.out.println(middleThree("windows"));// →"ndo"
        split();
    }

    private static boolean endsLy(String suffix) {
        /*Given a string, return true if it ends in "ly"
         */
        String str = suffix;
        return str.endsWith("ly");
        // return str.substring(str.length() - 2).equals("ly");
    }

    private static boolean inOrder(int a, int b, int c, boolean b0k) {
        /*Given three ints, a b c, return true if b is greater than a,
        and c is greater than b. However,
        with the exception that if "bOk" is
        true b does not need to be greater than a.
         */
        //boolean bOk;
        if (b0k = true && b < c) {
            return true;
        } else if (a < b && c > b) {
            return true;
        } else
            return false;
        /*IDEA в итоге предложила упростить так:
        if (b0k= b < c){
         return true;
        }else return a < b && c > b;
        НЕПОНЯТНО (((
         */
    }

    private static boolean lessBy10(int a, int b, int c) {
        /*
        Given three ints, a b c, return true if one of them
        is 10  more or less than one of the others.
         */
        return (a - b) >= 10 || (b - c) >= 10 || (c - a) >= 10;
    }

    private static void split() {
        System.out.println("____________");
    }

    private static String middleThree(String str) {
        /*
        Given a string of odd length, return the string
        length 3 from its middle, so "Candy" yields "and".
        The string length will be at least 3.
         */
        int middle = str.length() / 2;
        return str.substring(middle -1, middle +2);
        //-2 потому что substring а это -
        // "не вклбючая последний указанный символ"

        //  if (str.length()%2!=0 && str.length()>=3){
        //      return
        //  }
    }
}


