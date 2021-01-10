package lesson10;

public class HW10FiveStars {
    /*Дано число меньше 3000.
    При делении числа на 32 получается остаток 30,
    при делении на 58 - остаток 44. Найдите число или числа.
     */
    public static void main(String[] args) {

    }

    public static boolean giveMeNumber(int number) {
       //number1 == number2;
        return number % 32 == 30 || number % 58 == 44;
    }
}
