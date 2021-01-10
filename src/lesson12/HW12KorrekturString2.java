package lesson12;

public class HW12KorrekturString2 {
    public static void main(String[] args) {
        // Given a string of odd length,
        // return the string length 3 from its middle,
        // so "Candy" yields "and".
        // The string length will be at least 3.
        System.out.println(middleThree("Candy")); //→ "and"
        System.out.println(middleThree("Василий")); //→ "сил"
        System.out.println(middleThree("and")); //→ "and"
        System.out.println(middleThree("solving")); //→ "lvi"
    }

    private static String middleThree(String input) {
        int middle = input.length() / 2;
        String output = input.substring(middle - 1, middle + 2);
        return output;
    }
}
