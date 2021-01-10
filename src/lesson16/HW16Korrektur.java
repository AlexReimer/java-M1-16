package lesson16;

public class HW16Korrektur {
    public static void main(String[] args) {
        printDivisors(32);
        multiplicationTable(3);//->
    }

    private static void multiplicationTable(int number) {
        /*Реализовать метод печатающий таблицу умножения для заданного числа
        Пример: multiplicationTable(3)->
        3x1=3
        3x2=6
        ….
        3x10=30
         */
        for (int j = 0; j <= 10; j++) {
            System.out.println(number + "*" + j + "=" + (j * number));

        }
    }

    private static void printDivisors(int number) {
        /* Реализовать метод, который принимает целое положительное число. Метод должен выводить на экран все
        положительные числа, на которые заданное число делится без остатка и отображает количество найденных
        делителей.
        Пример: printDivisors(32) ->
        32
        16
        8
        4
        2
        1
        Total divisors: 6
         */
        int divisors = 0;
/*        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }*/
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }
        System.out.println("Total divisors:" + divisors);
    }


}
