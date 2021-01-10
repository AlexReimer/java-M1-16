package lesson09;

public class ExerciseString4 {
    /*Given 2 strings, return their concatenation,
    except omit the first char of each. The strings will be at least length 1.
     */
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));// → "ellohere"
        System.out.println(nonStart("java", "code"));// → "avaode"
        System.out.println(nonStart("shotl", "java"));// → "hotlava"
        System.out.println(nonStart("Telran", ""));// → error
    }

    private static String nonStart(String str, String str2) {
        return str.substring(1) + str2.substring(1);
    }

}
