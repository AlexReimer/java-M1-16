package lesson18;

public class ExerciseString02 {
    public static void main(String[] args) {
         /*Return the number of times that the string "code"
    appears anywhere in the given string, except we'll accept
    any letter for the 'd', so "cope" and "cooe" count.
     */
        System.out.println(countCode("aaacodebbb")); //→ 1
        System.out.println(countCode("codexxcode")); //→ 2
        System.out.println(countCode("cozexxcope")); // → 2
        System.out.println(countCode("cozexxcopecozexxcopecozexxcopecozexxcope")); // → 8

        System.out.println(extraFront("Hello"));//→"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));//→"HHH"

        System.out.println(startWord("hippo", "hi"));//→"hi"
        System.out.println(startWord("hippo", "xip"));//→"hip"
        System.out.println(startWord("hippo", "hlove"));// →""
        System.out.println(startWord("hippo", "i"));// →"h"
        System.out.println(startWord("hippo", "o"));// →"h"

    }

    private static String startWord(String str, String word) {
        String temp1 = str.substring(1);
        String temp2 = word.substring(1);
        if (str.startsWith(word)) {
            return str.substring(0, word.length());
        } else if (temp1.startsWith(temp2)) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    private static String extraFront(String word) {
        if (word.length() >= 2) {
            return word.substring(0, 2) + word.substring(0, 2) + word.substring(0, 2);
        } else if (word.length() == 1) {
            return word.substring(0, 1) + word.substring(0, 1) + word.substring(0, 1);
        } else {
            return "";
        }
    }

    private static int countCode(String input) {
        // charAt
        // если code равен буквам с индексом 0,1,2,3; то тогда 1
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c'
                    && input.charAt(i + 1) == 'o'
                    && input.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
