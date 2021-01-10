package lesson12;

public class HW12KorrekrurBoolean {
    // Given three ints, a b c, return true if one of them is 10
    // or more less than one of the others.
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11)); // → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
    }

    private static boolean lessBy10Second(int a, int b, int c) {
        if (a <= b - 10 || a <= c - 10) {
            return true;
        } else if (b <= a - 10 || b <= c - 10) {
            return true;
        } else if (c <= a - 10 || c <= b - 10) {
            return true;
        }
        return false;
    }

    private static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10
                || Math.abs(b - c) >= 10
                || Math.abs(c - a) >= 10;
    }
}

