package lesson25.HomeWork25;

public class HW25TernarOperator {
    public static void main(String[] args) {

        System.out.println(getMeMax(15, 5));//15
        System.out.println(getMeMax(4, 16));//16
        System.out.println(getMeMax(20, 100));//100

        System.out.println("________");

        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100

        System.out.println("________");

        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
        System.out.println(myFirstCompareTo("Рио", "Био"));// → "Био"

        System.out.println("________");
    }

    private static String myFirstCompareTo(String str1, String str2) {
        String firstLetter;
        firstLetter = str1.compareTo(str2) < 0 ? str1 : str2;
        return firstLetter;
    }

    private static int getMeMin(int a, int b) {
        int minNumber;
        minNumber = a < b ? a : b;
        return minNumber;
    }

    private static int getMeMax(int a, int b) {
        int maxNumber;
        maxNumber = a > b ? a : b;
        return maxNumber;
    }


}
