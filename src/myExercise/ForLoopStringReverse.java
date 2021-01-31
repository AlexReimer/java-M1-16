package myExercise;

public class ForLoopStringReverse {
    public static void main(String[] args) {
        String str = stringReverse("Ten et");
        System.out.println(str);
    }

    private static String stringReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        result = result.toLowerCase();
        return result;
    }
}
