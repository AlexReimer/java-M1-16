package lesson18;


public class HomeWork18String {
    public static void main(String[] args) {

        System.out.println(minCat("java", "rush"));// → "javarush"
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("java", "Hello"));// → "javaello"
    }

    private static String minCat(String str, String str2) {
/*
    Given two strings, append them together (known as "concatenation")
    and return the result. However, if the strings are
    different lengths, omit chars from the longer string so it is the same length
    as the shorter string. So "Hello" and "Hi" yield
    "loHi". The strings may be any length.
     */

        if (str.equals(str2))
            return str + str2;
        if (str.length() > str2.length()){
            int difference = str.length() - str2.length();
            return str.substring(difference, str.length()) + str2;
        } else if (str2.length() > str.length()){
            int difference = str2.length() - str.length();
            return str2.substring(difference, str2.length()) + str;
        } else
            return "";





//        String first = str.substring(0);
//        String senond = str2.substring(0);
//        if (str.substring(0) == str2.substring(0)){
//            return str.substring(0) + str2.substring(0);
//        }else if (str.substring(0) > str2.substring(0) || str.substring(0) < str2.substring(0))
//        return "";
    }



}

