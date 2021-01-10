package myExercise;

public class StringExercise {

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));// →"Hello Bob!"
        System.out.println(helloName("Alice"));// →"Hello Alice!"
        System.out.println(helloName("X"));// →"Hello X!"

        System.out.println("__________");

        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"

        System.out.println("__________");

        System.out.println(firstHalf("WooHoo"));// → "Woo"
        System.out.println(firstHalf("HelloThere"));// → "Hello"
        System.out.println(firstHalf("abcdef"));// → "abc"

        System.out.println("__________");

        System.out.println(nonStart("Hello", "There"));// →"ellohere"
        System.out.println(nonStart("java", "code"));// →"avaode"
        System.out.println(nonStart("shotl", "java"));// →"hotlava"

        System.out.println("__________");

        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
        System.out.println(theEnd("Kukareku", false));// → "u"

        System.out.println("__________");

        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
        System.out.println(endsLy("Mougly"));// → true

        System.out.println("__________");

        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"

        System.out.println("__________");

        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"

        System.out.println("__________");

        System.out.println(seeColor("redxx"));// →"red"
        System.out.println(seeColor("xxred"));// →""
        System.out.println(seeColor("blueTimes"));// →"blue"

        System.out.println("__________");

        System.out.println(extraFront("Hello"));// → "HeHeHe"
        System.out.println(extraFront("ab"));// → "ababab"
        System.out.println(extraFront("H"));// → "HHH"

        System.out.println("__________");

        System.out.println(startWord("hippo", "hi"));// → "hi"
        System.out.println(startWord("hippo", "xip"));// → "hip"
        System.out.println(startWord("hippo", "i"));// → "h"

        System.out.println("__________");

        System.out.println(makeAbba("Hi", "Bye"));// → "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// → "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// → "WhatUpUpWhat"

        System.out.println("__________");

        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"

        System.out.println("__________");

        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"

        System.out.println("__________");

        System.out.println(left2("Hello"));// →"lloHe"
        System.out.println(left2("java"));// →"vaja"
        System.out.println(left2("Hi"));// →"Hi"

        System.out.println("__________");

        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""

        System.out.println("__________");

        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        System.out.println(nTwice("Gummibaerchen", 5));// → "Gummirchen"
        System.out.println(nTwice("Gummibaerchen", 1));// → "Gn"

        System.out.println("__________");

        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx"));// → true
        System.out.println(hasBad("xxbadxx"));// → false

        System.out.println("__________");

    }

    private static String hasBad(String str) {
        /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
        such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length,
        including 0. Note: use .equals() to compare 2 strings.
         */
        String str1 = "bad";
       // str1 = str.contains(str1);
        return null;
    }

    private static String nTwice(String str, int n) {
        /*Given a string and an int n, return a string made of the first
        and last n chars from the string. The string length will be at least n.*/
       //!!! как int без преобразования считывается количество индексов, определенных в n
        return str.substring(0,n) + str.substring(str.length()-n);
    }

    private static String withoutEnd2(String str) {
        /*Given a string, return a version without both the first
        and last char of the string. The string may be any length, including 0.*/
        if (str.length() <=2) return "";
        return str.substring(1, str.length()-1);
    }

    private static String left2(String str) {
       /* Given a string, return a "rotated left 2"
       version where the first 2 chars are moved to the end.
       The string length will be at least 2.*/
        if (str.length() <= 2) return str;
        return str.substring(2) + str.substring(0,2);
    }

    private static String withoutEnd(String str) {
        /*Given a string, return a version without the first and last char,
        so "Hello" yields "ell". The string length will be at least 2.*/
        return str.substring(1, str.length() - 1);
    }

    private static String extraEnd(String str) {
        /*Given a string, return a new string made of 3
        copies of the last 2 chars of the original string.
        The string length will be at least 2.*/
        String substring = str.substring(str.length() - 2);
        return substring + substring + substring;
    }

    private static String makeAbba(String a, String b) {
        /*Given two strings, a and b, return the result of putting them together
        in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */
        return a + b + b + a;
    }

    private static String startWord(String str, String word) {
        /*Given a string and a second "word" string, we'll say that the word matches
        the string if it appears at the front of the string, except its first char
        does not need to match exactly. On a match, return the front of the string,
        or otherwise return the empty string. So, so with the string "hippo"
        the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.*/

        return null;
    }

    private static String extraFront(String str) {
        /*Given a string, return a new string made of 3 copies
        of the first 2 chars of the original string.
        The string may be any length. If there are fewer than 2 chars,
        use whatever is there.*/
        if (str.length() == 1) return str.substring(0) + str.substring(0) + str.substring(0);
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

    private static String seeColor(String str) {
        /*Given a string, if the string begins with "red" or "blue"
        return that color string, otherwise return the empty string.*/
        if (str.startsWith("red")) return "red";
        if (str.startsWith("blue")) return "blue";
        return "";
    }

    private static String lastChars(String a, String b) {
        /*Given 2 strings, a and b, return a new string
        made of the first char of a and the last char of b,
        so "yo" and "java" yields "ya". If either string is length 0,
        use '@' for its missing char.*/
//        if (b == "") return a.substring(0,1) + "@";
//        return a.substring(0,1) + b.substring(b.length() - 1);
        //такой же результат будет через метод "charAt(int index)"
        if (b == "") return a.charAt(0) + "@";
        return a.charAt(0) + b.substring(b.length() - 1);
    }

    private static String middleThree(String str) {
        /*Given a string of odd length, return the string length 3
        from its middle, so "Candy" yields "and".
        The string length will be at least 3.*/
        int middlepoint;
        int length;
        if (str.length() >= 3 && str.length() % 2 != 0) {
            middlepoint = str.length() / 2 - 1;
            length = 3;
            return str.substring(middlepoint, middlepoint + length);
        }
        return null;
    }

    private static boolean endsLy(String wrd) {
        /*Given a string, return true if it ends in "ly".*/
        String str1, str2;
        boolean bool;
        str1 = wrd;
        str2 = "ly";
        //endsWith(String suffix) для определения, есть ли подстрока (str2) окончанием исходной строки (str1)
        bool = str1.endsWith(str2);//заканчивается ли str1 с str2
        return bool;//возвращает true/false
    }

    private static String theEnd(String str, boolean bool) {
        /*Given a string, return a string length 1 from its front,
        unless front is false, in which case return a string length 1
        from its back. The string will be non-empty.*/
        if (bool == true) return str.substring(0, 1);
        //а так возвращают последний индекс в стринге
        return str.substring(str.length() - 1);
    }

    private static String nonStart(String s1, String s2) {
       /* Given 2 strings, return their concatenation,
       except omit the first char of each. The strings
       will be at least length 1.*/
        return s1.substring(1) + s2.substring(1);
    }

    private static String firstHalf(String str) {
        /*Given a string of even length,
        return the first half. So the string "WooHoo" yields "Woo".*/
        return str.substring(0, str.length() / 2);
    }

    private static String makeOutWord(String str1, String str2) {
        /*Given an "out" string length 4, such as "<<>>",
        and a word, return a new string where the word is
        in the middle of the out string, e.g. "<>".
        Note: use str.substring(i, j) to extract the String starting at index i
        and going up to but not including index j.
         */
        String s1 = str1;
        String s2 = str2;
        //s1.substring(index 1, index 2 end) -  первый индекс начало субстринга,
        // второй индекс - конец минус один, т.е. на один пункт раньше, невключительно!!
        String substr = s1.substring(0, 2) + s2.substring(0) + s1.substring(2);
        return substr;
    }

    private static String helloName(String str) {
        /*Given a string name, e.g. "Bob", return
        a greeting of the form "Hello Bob!".*/
        // String str1 = new String();
        //System.out.println("Hello " + str + "!" );
        return "Hello " + str + "!";
    }
}
