package lesson20;

public class HW_EnigmaCesar {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }

    private static char symbolCode(char symbol) {
        char result = 0;
        //варианты
        // 1.result = ( char) (symbol +3);
        //2. первый способ плюс исключения (символы) через инфу
        //3.Сделать свою табоицу инпута и оутпута через Стринг или через массив сивволов
        //4.switch
        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,.";
        //сдвиг на 3 символа как описано в википедии о шифровании Цезаря
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв ,.";

        int index = input.indexOf(symbol);//получаем индекс подткоторым стоит буква (0..32)
        result = output.charAt(index);
        return result;
    }
}
