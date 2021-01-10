package lesson12;

public class HW12KorrekturString {
    public static void main(String[] args) {
        //Given a string, return a string length 1 from its front,
        // unless front is false,
        // in which case return a string length 1 from its back.
        // The string will be non-empty.
        System.out.println(theEnd("Hello", true)); //→ "H"
        System.out.println(theEnd("Hello", false)); //→ "o"
        System.out.println(theEnd("oh", true)); //→ "o"
    }

    private static String theEnd(String str, boolean front) {
        String result = str.substring(0, 1);
        if (!front) {
            result = str.substring(str.length() - 1);
        }
        return result;
    }
}

