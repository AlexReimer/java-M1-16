package lesson19;
/*

public class Exex3_WithoutX2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));// → "Hi"
    }

    private static String withoutX2(String input) {
        */
/*
        Given a string, if one or both of the first 2 chars is 'x',
        return the string without those 'x' chars, and otherwise return the
        string unchanged. This is a little harder than it looks.
         *//*


        // if (input.substring(0,2).equals("xx"))
        if (input.charAt(0) == 'x' && input.charAt(1) == 'x') {
            return input.substring(2);
        } else if (input.charAt(0) == 'x') {
            return input.substring(1);
        } else if (input.charAt(1) == 'x') {
            return input.substring(0, 1) + input;
            { else {
            }
                return input;
            }
        }
    }
}
*/



