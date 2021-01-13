package lesson27;

public class ExerciseStringForI {
    public static void main(String[] args) {

        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1)); // →"o"

        System.out.println("----------");

        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false

        System.out.println("----------");

        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → true

        System.out.println("----------");

    }


    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 1; i < str.length() - 1; i++) {
            if (star == str.charAt(i) && str.charAt(i - 1) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }


    private static boolean prefixAgain(String word, int n) {
        String prefix = word.substring(0, n);
        //1. return word.indexOf(prefix, n) != -1;//indexOf возвращает -1 если ничего не найдено.поэтому говорим, если -1, то ничего не возращает ничего

        return word.substring(n).contains(prefix);//самый оптимальный вариант

      /*  for (int j = n; j < word.length() - n; j++) {
            if (word.substring(0, n).equals(word.substring(j, j + n))) {//самое "дорогое" решение
                return true;
            }
        }
        return false;*/
    }


    private static String repeatEnd(String word, int n) {
        String newWord = "";
        for (int i = word.length() - 1; i < word.length() - n; i++) { //word.length() -1

        }
        return newWord;
    }

}
