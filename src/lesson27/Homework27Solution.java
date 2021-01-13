package lesson27;

    public class Homework27Solution {

        public static void main(String[] args) {
/*        System.out.println(countHi("abc hi ho")); //→ 1
        System.out.println(countHi("ABChi hi")); //→ 2
        System.out.println(countHi("hihi")); // → 2*/
/*        System.out.println(blackjack(19, 21)); //→ 21
        System.out.println(blackjack(21, 19)); //→ 21
        System.out.println(blackjack(19, 22)); //→ 19
        System.out.println(blackjack(22, 22)); //→ 0*/
            System.out.println("**************#4");
            System.out.println(loneSum(1, 2, 3));// → 6
            System.out.println(loneSum(3, 2, 3));// → 2
            System.out.println(loneSum(3, 3, 3));// → 0
            System.out.println(loneSum(3, 1, 1));// → 3
            System.out.println(loneSum(2, 2, 2));// → 0
        }

        private static int loneSum(int a, int b, int c) {
            if (a == b && a == c) {
                return 0;
            }
            if (a == b) {
                return c;
            }
            if (a == c) {
                return b;
            }
            if (b == c) {
                return a;
            }
            return a + b + c;
/*        int sum = a + b + c;
        if (a == b && b == c) sum = 0;
        else if (a == b) sum = c;
        else if (a == c) sum = b;
        else if (c == b) sum = a;
        return sum;*/
        }

        private static int blackjack(int a, int b) {
            if (a > 21) a = 0;
            if (b > 21) b = 0;
            return Math.max(a, b);

/*        if (a > 21 && b > 21) {
            return 0;
        } else if (a <= 21 && a > b) {
            return a;
        } else if (b <= 21 && b > a) {
            return b;
        } else
        return -1;*/
        }

        private static int countHi(String word) {
            int count = 0;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == 'h' && word.charAt(i + 1) == 'i') {
                    count++;
                }
            }
            return count;
        }

    }
