package lesson28;

public class HW28RoundingAndString {
    public static void main(String[] args) {
        /*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to
        20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
        Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int
        round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
        */
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10
        System.out.println(roundSum(77, 26, 45));// → 160


    }

    public static int roundSum(int a, int b, int c) {
        int sum = 0;
        sum = round10(a) + round10(b) + round10(c);
        return sum;
    }

    public static int round10(int num) {
        int temp = num / 10;
        if (num % 10 >= 5) {
            temp *= 10;
            return temp + 10;
        }
        return temp * 10;
    }

//    private static int roundSum(int a, int b, int c) {
//        int number = 16;
//int result =
//        System.out.println(Math.round(number));
//        outout =
//    }
//    return
}
