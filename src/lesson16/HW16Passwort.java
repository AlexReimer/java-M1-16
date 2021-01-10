package lesson16;

public class HW16Passwort {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
    }

    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.charAt(i) + str.charAt(i); //charAt дай мне символ с индекса i

        }
        return output;
    }
}
