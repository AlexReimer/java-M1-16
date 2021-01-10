package lesson12;

public class HW12KorrekturBoolean {
    public static void main(String[] args) {
        // Given a string, return true if it ends in "ly".
        System.out.println(endsLy("oddly")); //→ true
        System.out.println(endsLy("y")); //→ false
        System.out.println(endsLy("oddy")); //→ false
    }

    private static boolean endsLy(String input) {
        return input.endsWith("ly");
    }
}


