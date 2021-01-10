package lesson09;

public class HWModulo {
    public static void main(String[] args) {
        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        // See also: Introduction to Mod
        //Перевод: Верни true, если заданное неотрицательное число больше 1 или 2, кратное 20
        //more20(20) → false
        //more20(21) → true
        //more20(22) → true
        System.out.println(more20(20));//ожидается → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
        System.out.println(more20(85));// → false
        System.out.println(more20(101));// → true
    }

    private static boolean more20(int number) {
        //1.Дано
        //2.Найти
        //3.Решение
        int temp = number % 20;
        return temp - 1 == 0 || temp - 2 == 0;
        //return temp - 1 == 0 || number % 20 == 0;
        //return temp > 0 && temp < 3;
        }
    }
