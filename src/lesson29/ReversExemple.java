package lesson29;

public class ReversExemple {
    public static void main(String[] args) {
        //дано чиало переверните его, например 546 -> 645
        System.out.println(simpleNumberReverse(546));//645
        System.out.println(simpleNumberReverse(5798));//8975
        System.out.println(simpleNumberReverse(123));//321
        System.out.println(reverse("А роза упала на лапу Азора"));//реверс

    }

    private static int simpleNumberReverse(int number) {
        // 1.Перевести в стринг
        //2.Записать задои наперед ИСПОЛЬЗУЯ ОТДЕЛЬНЫЙ МЕТОД
        //3.Перевести в инт и отдать
        String temp = String.valueOf(number);//"546"
        String tempReverse = reverse(temp); //645
        int result = Integer.parseInt(tempReverse); //645
        return result;
    }
//А роза упала на лапу Азора
    private static String reverse(String input) {
        //стринг АУТПУТ
        //ПРосто поменять местами
        //3.Вернуть
        String output = "";
        for (int i = input.length() - 1; i >=0 ; i--) {
            //последнее значение ИНПУТ в первую букву АУТПУТ
            output = output + input.charAt(i);
        }
        return output;
    }

}
