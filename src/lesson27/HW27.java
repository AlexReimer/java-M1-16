package lesson27;

public class HW27 {
    public static void main(String[] args) {
        /*Given 2 int values greater than 0,
        return whichever value is nearest to 21 without going over.
        Return 0 if they both go over.*/
        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(20, 22));// → 20
        System.out.println(blackjack(21, 21));// → 21

        System.out.println("_________");

        /*Given 3 int values, a b c, return their sum. However,
        if one of the values is the same as another of the values,
        it does not count towards the sum. */
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 1, 1));// → 3
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0

        System.out.println("_________");

        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2

    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("hi")) {
                count++;
            }
        }
        return count;
    }

        private static int loneSum ( int a, int b, int c){
            if (a != b && a != c && c != b) return a + b + c;
            if (a == b && b != c) return c;
            if (a == c && c != b) return b;
            if (a != b && b == c) return a;
            return 0;
        }

        private static int blackjack ( int a, int b){
            if (a == 21 && b < 21) return a;
            if (b == 21 && a < 21) return b;
            if (a > 21) return b;
            if (b > 21) {
                return a;
            } else {
                return 0;
            }
        }
    }




