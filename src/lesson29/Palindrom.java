package lesson29;
//
//import java.util.Locale;
//
//public class Palindrom {
//    public static void main(String[] args) {
//        //"А роза упала на лапу Азора"
//        // "pop" - true
//        //"JavaScript" - false
//        //Решение
//        //1.Привести к одному регистру //tolowerCase
//        //2.Убрать пробелы  //сложновато, надо писать метод
//        //3.Перевернуть слово или фразу - реверс стринга //есть такой метод
//        //4.Сравнить инпут с аутпутом // equals
//        //5.Вернуть сравнение //return
////
//        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
//        System.out.println(checkPalindrom("поп"));// -> true
//        System.out.println(checkPalindrom("школа"));// -> false
//    }

//    private static boolean checkPalindrom(String word) {
//        String input = word;
//        //1.Привести к одному регистру
//        input = input.toLowerCase();
//        input =deleteSpace(input);
//        String output = wordReverce (input)
//        return input.equals(output);
//    }
//
//    public static String deleteSpace (String input) {
//        String output = "";
//        for (int i = 0; i < input.length(); i++) {
//            if (i != '') {
//                output = output + input.charAt(i);
//            }
////        }
////    }
//
//
//    private static String wordReverce(String input) {
//       String result = "";
//        for (int i = 0; i < input.length(); i++) {
//            result = input.charAt(i) + result; //так мы идим с конца в начало
//
//        }
//        return result;
//    }
//
//}
