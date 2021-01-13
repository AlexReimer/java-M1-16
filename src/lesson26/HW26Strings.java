//package lesson26;
//
//public class HW26Strings {
//    public static void main(String[] args) {
////        System.out.println(countCode("aaacodebbb"));// → 1
////        System.out.println(countCode("codexxcode"));// → 2
////        System.out.println(countCode("cozexxcope"));// → 2
////        System.out.println(countCode("cozexxcopa"));// → 1
////        System.out.println(countCode("cozexxcopaco"));// → 1
////
////        System.out.println(bobThere("abcbob"));// → true
////        System.out.println(bobThere("b9b"));// → true
////        System.out.println(bobThere("bac"));// → false
////    }
////
////    private static boolean bobThere(String word) {
////        int count = 0;
////        for (int i = 0; i < word.length() - 2; i++) {
////            if ('b' == word.charAt(i) && 'b' == word.charAt(i + 2)) {
////                count ++;
////            }
////        }
////    }
////
////    private static int countCode(String word) {
////        /*Return the number of times that the string "code"
////        appears anywhere in the given string, except we'll
////        accept any letter for the 'd', so "cope" and "cooe" count.
////         */
////        int count = 0;
////        String pattern = "code";
////        for (int i = 0; i < word.length() - 3; i++) { // i < word.length()-3 так мы указываем, что ограничиваем область поиска
////            if (word.charAt(i) == 'c'
////                    && word.charAt(i + 1) == 'o'
////                    && word.charAt(i + 3) == 'e') {
////                count++;
//////                count = count+1; // то же самое что count++
//////                count +=1; // то же самое что count++
//////                ++count; // то же самое что count++
////            }
////
////        }
//
////
////        //String codeString ="";
////        String substring ="code";
////        //boolean
////        if(codeString.length()
////                contains("code")) {
////            if (codeString.)
////        }
//////        return 0;
////    }
////
////
////}
