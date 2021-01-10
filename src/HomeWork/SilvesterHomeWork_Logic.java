package HomeWork;

public class SilvesterHomeWork_Logic {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true
        System.out.println(love6(13, 7));// → true
        System.out.println(love6(10, 3));// → false

        System.out.println("__________");

        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(23));// → false
        System.out.println(more20(-20));// → false

        System.out.println("__________");



        System.out.println("__________");

    }


    private static boolean more20(int c) {
     /*   Return true if the given non-negative number is 1 or 2
     more than a multiple of 20. See also: Introduction to Mod
    */
        if (c % 20 != 0) if (c % 20 == 1) return true;
        return c % 20 == 2;//true
        //все остальные случаи - верни false
    }

    private static boolean love6(int a, int b) {
    /* The number 6 is a truly great number. Given two int values, a and b,
    return true if either one is 6. Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.
    */
        //if (a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6) { // мой вариант
        //  if (a == 6 || b == 6 || a + b == 6 || Math.abs(a-b) == 6 ) { //Из интернета. не ясно зачем здесь Math.abs
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;//simplyfi вариант
    }


}


