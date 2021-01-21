package lesson04;

public class ErrorKorrektur {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay")); // "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); // "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // "[[word]]"
        System.out.println(makeOutWord("!??!дкйхгдсфлкйгх", "Василий")); // "[[word]]"
        String hausmaster = "Василий";
        System.out.println(hausmaster.substring(0, 3));
        System.out.println(hausmaster.substring(5));
        System.out.println(hausmaster.substring(4));
        System.out.println(hausmaster.charAt(3));
    }

        //Given an “out” string length 4, such as “«»”,
        // and a word, return a new string where the word is in the middle of the out string,
        // e.g. “«word»”. Note: use str.substring(i, j) to extract the String starting at index i
        // and going up to but not including index j.
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        //makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        //makeOutWord("[[]]", "word") → "[[word]]"

        public static String makeOutWord(String out, String word) {
            String result = "";
            result = out.substring(0, 2) + word + out.substring(2);
            return result;
    }

}
