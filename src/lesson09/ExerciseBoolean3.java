package lesson09;

public class ExerciseBoolean3 {
    /*The number 6 is a truly great number.
    Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6.
    Note: the function Math.abs(num) computes the absolute value of a number.
     */
    public static void main(String[] args) {
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true
    }

    private static boolean love6(int a, int b) {
        int sum = a +b;
        int dif = Math.abs(a-b);
        return (a == 6 || b == 6) || sum==6 || dif==6; 
    }

    private static boolean love6Second(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if ((a + b) == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }
}
