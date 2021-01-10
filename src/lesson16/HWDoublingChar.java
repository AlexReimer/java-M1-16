package lesson16;

public class HWDoublingChar {
    public static void main(String[] args) {
        String age = "18";
        int myAge = Integer.parseInt(age);
        String output = "" + myAge;
        String output1 = String.valueOf(myAge);
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
    }

    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            //output = output + str.charAt(i) + str.charAt(i);
            output = output + nTimesRepeat(str.charAt(i), 5);
        }

        return output;
    }

    private static String nTimesRepeat(char symbol, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + symbol;
        }
        return result;
    }


}
