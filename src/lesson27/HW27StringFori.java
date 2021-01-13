package lesson27;

public class HW27StringFori {
    public static void main(String[] args) {
        /*Return a version of the given string, where for every star ()
        in the string the star and the chars immediately to its left and
        right are gone.So "abcd" yields "ad" and "ab**cd" also yields "ad".

        Алгоритмический разбор:

        1.В цикле просмотреть все внутренние символы. Кроме первого и последнего символа.
        2.Посмотреть что на первом символе. Разобраться с ним
        3.Последний символ. разобраться с ним
         */

        System.out.println(starOut("ab*cd")); //→ "ad"
        System.out.println(starOut("ab**cd")); //→ "ad"
        System.out.println(starOut("sm*eilly")); //→ "silly"
        System.out.println(starOut("*sm***eilly*")); //→ "silly"
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';

        // 1. шаг
        if (input.charAt(0) != star && input.charAt(1) != star) {
            output += input.charAt(0);
        }

        // 2 шаг
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != star &&
                    input.charAt(i - 1) != star &&
                    input.charAt(i + 1) != star) {
                output += input.charAt(i);
            }
        }
        // 3 шаг
        if (input.charAt(input.length() - 1) != star &&
                input.charAt(input.length() - 2) != star) {
            output += input.charAt(input.length() - 1);
        }
        return output;
    }

}
