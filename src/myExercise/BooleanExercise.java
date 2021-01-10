package myExercise;

public class BooleanExercise {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false));// → true
        System.out.println(cigarParty(70, true));// → true
        System.out.println(cigarParty(70, false));// → false

        System.out.println("__________");

        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
        System.out.println(caughtSpeeding(81, false));// → 2
        System.out.println(caughtSpeeding(81, true));// → 1

        System.out.println("__________");

        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true
        System.out.println(love6(3, 3));// → true
        System.out.println(love6(35, 29));// → true

        System.out.println("__________");

        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(40));// → false
        System.out.println(more20(41));// → true

        System.out.println("__________");

        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
        System.out.println(nearTen(21));// → true
        System.out.println(nearTen(32));// → true
        System.out.println(nearTen(29));// → true
        System.out.println(nearTen(33));// → false

        System.out.println("__________");

        System.out.println(teaParty(6, 8));// → 1
        System.out.println(teaParty(3, 8));// → 0
        System.out.println(teaParty(20, 6));// → 2

        System.out.println("__________");

        System.out.println(twoAsOne(1, 2, 3));// → true
        System.out.println(twoAsOne(3, 1, 2));// → true
        System.out.println(twoAsOne(3, 2, 2));// → false

        System.out.println("__________");

        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        System.out.println(lastDigit(19, 29, 15));// → true
        System.out.println(lastDigit(7, 29, 15));// → false
        System.out.println(lastDigit(117, 47, 75));// → true

        System.out.println("__________");
    }

    private static boolean lastDigit(int a, int b, int c) {
       /* Given three ints, a b c, return true if two or more
       of them have the same rightmost digit. The ints are non-negative.
       Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.*/
        int temp1 = a%10;
        int temp2 = b%10;
        int temp3 = c%10;
        return (temp1==temp2 || temp2==temp3 || temp3==temp1);
    }

    private static boolean twoAsOne(int a, int b, int c) {
        /*Given three ints, a b c, return true if it is
        possible to add two of the ints to get the third. */
        return a + b == c || b + c == a || c + a == b;
    }

    private static int teaParty(int tea, int candy) {
        /*We are having a party with amounts of tea and candy.
        Return the int outcome of the party encoded as 0=bad, 1=good,
        or 2=great. A party is good (1) if both tea and candy are at least 5.
        However, if either tea or candy is at least double the amount
        of the other one, the party is great (2).
        However, in all cases, if either tea or candy is less than 5,
        the party is always bad (0).*/

        int outcome = 0;
        if (tea >= 5 || candy >= 5) outcome = 1;
        if (tea / candy >= 2 || candy / tea >= 2) outcome = 2;
        if (tea < 5 || candy < 5) outcome = 0;
        return outcome;
        //можно и так как ниже- не мое
       /* if(tea < 5 || candy < 5)
            return 0;
        if(tea >= 2 * candy || candy >= 2 * tea)
            return 2;
        return 1;*/
    }

    private static boolean nearTen(int num) {
        /*Given a non-negative number "num", return true
        if num is within 2 of a multiple of 10. Note: (a % b)
        is the remainder of dividing a by b, so (7 % 5) is 2.
        See also: Introduction to Mod */
        //это не сработало
        // if (num %10 <=2)
        //    return num % 10 >= 8;
        //    return false;
        // а это сработало
        int temp = num % 10;
        return temp - 1 == 0 || temp - 2 == 0 || temp - 8 == 0 || temp - 9 == 0;
    }

    private static boolean more20(int num) {
        /*Return true if the given non-negative number is 1 or 2 more
        than a multiple of 20. See also: Introduction to Mod */
        if (num % 20 != 0) if (num % 20 == 1) return true;
        return num % 20 == 2;
        //а вот так короче и проще - не мое
//        int temp = num % 20;
//        return temp - 1 == 0 || temp - 2 == 0;
    }

    private static boolean love6(int a, int b) {
        /*The number 6 is a truly great number.
        Given two int values, a and b, return true if either one is 6.
        Or if their sum or difference is 6.
        Note: the function Math.abs(num) computes the absolute value of a number.*/
        return a == 6 || b == 6 || a + b == 6 ||
                Math.abs(a - b) == 6 || Math.abs(b - a) == 6;
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
       /* You are driving a little too fast, and a police officer
       stops you. Write code to compute the result, encoded as an
       int value: 0=no ticket, 1=small ticket, 2=big ticket.
       If speed is 60 or less, the result is 0. If speed is between
       61 and 80 inclusive, the result is 1. If speed is 81 or more,
       the result is 2. Unless it is your birthday -- on that day,
       your speed can be 5 higher in all cases.*/
        int ticket = 0;
        if (birthday) speed = speed - 5; // speed -= 5  можно и так
        if (speed <= 60) ticket = 0;
        if (61 <= speed && speed <= 80) ticket = 1;
        if (speed >= 81) ticket = 2;
        return ticket;
    }

    private static boolean cigarParty(int cigars, boolean weekend) {
        /*When squirrels get together for a party, they like to have cigars.
        A squirrel party is successful when the number of cigars is between
        40 and 60, inclusive. Unless it is the weekend, in which case there
        is no upper bound on the number of cigars. Return true if the party
        with the given values is successful, or false otherwise.
         */
        return (cigars > 40 && cigars <= 60 && !weekend) || (cigars > 60 && weekend);
    }
}

