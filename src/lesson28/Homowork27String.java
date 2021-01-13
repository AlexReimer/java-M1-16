package lesson28;

public class Homowork27String {
    public static void main(String[] args) {
/*Return a version of the given string, where for every star () 
in the string the star and the chars immediately to its left 
and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
 */

        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
    }

    private static String starOut(String str) {
        String output = "";
        char star = '*';
        for (int i = 0; i < str.length(); i++) {

            
        }
        
        return output;
    }
}
