package lesson12;

public class HW12Kurrektur {
    public static void main(String[] args) {
        /*
 Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is
true, b does not need to be greater than a.
*/
        System.out.println(inOrder(1, 2, 4, false)); //→true
        System.out.println(inOrder(1, 2, 4, true)); //→true
        System.out.println(inOrder(1, 2, 1, false)); //→false
        System.out.println(inOrder(1, 1, 2, true)); //→true
    }

    private static boolean inOrderSecond(int a, int b, int c, boolean bOK) {
        if (b > a && c > b && !bOK) {
            return true;
        } else if (c > b && bOK) {
            return true;
        }
        return false;
    }

    private static boolean inOrder(int a, int b, int c, boolean bOK) {
        if (bOK && c > b) {
            return true;
        } else if (b > a && c > b) {
            return true;
        }
        return false;
    }
}