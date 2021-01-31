package myExercise;

public class ForLoopPalindrom {
    public static void main(String[] args) {
        /*Написать свой метод проверки строки на палиндром.
        Учесть, что палиндром может быть предложением с пробелами.
        При решении задачи используйте цикл.
        Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.*/

//        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
//        System.out.println(checkPalindrom("Te net"));// -> true
        System.out.println(checkPalindrom("abc d dcba"));// -> true
        System.out.println(checkPalindrom("школа"));// -> false

    }

    public static boolean checkPalindrom(String str) {
       String reverse = "";
       String newStr = "";
       boolean boo;
        for (int i = str.length() -1; i >=0 ; i--) {
            if (str.charAt(i) != ' ') {
                reverse = reverse + str.charAt(i);
                newStr = newStr + str.charAt(i);
            }
           System.out.println(reverse);
        }
        reverse = reverse.toLowerCase();
        System.out.println(reverse);
        System.out.println(newStr);
        boo = newStr.equalsIgnoreCase(reverse);
        return boo;
    }
}
