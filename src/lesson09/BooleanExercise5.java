package lesson09;

public class BooleanExercise5 {
    public static void main(String[] args) {
        //Given three ints, a b c, return true if two or more of them
        // have the same rightmost digit. The ints are non-negative.
        // Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
        /*если остаток в 'а' после "сокращения" на 10 равен остатку в 'b'
        после сокращения на 10, то true
        */
    }
}
