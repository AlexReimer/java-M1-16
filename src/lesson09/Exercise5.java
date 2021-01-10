package lesson09;

public class Exercise5 {
    /*Given a string, return a string length 1 from its front,
    unless front is false, in which case return a string length 1 from its back.
     The string will be non-empty.
     */
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));//→ "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
    }

    private static String theEnd(String word, boolean b) {
//если в = тру, то тогда верни первую букву, иначе верни последнюю
        String output = "";
        if (b) { //b==true
            //return word.substring(word.length() -1);
            output = word.substring(0,1);
        }else{
            return word.substring(word.length() -1);
        }
                return output;
    }
}