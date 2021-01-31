package myExercise;

public class ForLoopJuer {
    public static void main(String[] args) {
        //Найдите произведение целых чисел от 1 до 20.
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result = result * i;
        }
        System.out.println(result);

        System.out.println("--------");

        //Найдите сумму четных чисел от 2 до 100.
        int sumEven = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
        }
        System.out.println(sumEven);

        System.out.println("--------");

        //Найдите сумму нечетных чисел от 1 до 99.
        int sumOdd = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);

    }
}