package lesson10;

public class HW10 {
    public static void main(String[] args) {
        //находит чётные числа
        System.out.println(evenNumber(19));// -> false
        System.out.println(evenNumber(864));//->true

        //находит нечётные числа
        System.out.println(oddNumber(263));

        //проверяет год на високосность. По Википедии
        System.out.println(leapYearWiki(2020));//

    }

    private static boolean leapYearWiki(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;
    }

    private static boolean oddNumber(int numero) {
        return numero % 2 != 0; //?? не равно здесь с одним знаком равенства !=, а не !==
    }

    private static boolean evenNumber(int num) {
        return !evenNumber(num);

    //private static boolean evenNumber(int num) {
     //   return num % 2 == 0;
    }

}
