package myExercise;

public class ForLoopSumAverageRunningInt {
    public static void main(String[] args) {
//дан диапазон между двумя интами: 1)вывести сумму цифр между интами 2)вывести среднее значение
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;
        for (int i = lowerbound; i <= upperbound; ++i) { //
            sum += i; //update то же что и sum = sum +i;
        }
        double average = sum / 100; // для расчета среднего значения
        System.out.println("The sum of numbers from --- to --- is: " + sum);
        System.out.println("The average is: " + average);

        System.out.println("---------");

//то же самое, но через while
        int sum2 = 0;
        int number1 = lowerbound;
        while (number1 <= upperbound) {
            sum2 += number1;
            number1++; //update
        }
        double average2 = sum2 / 100;
        System.out.println("The sum of numbers from --- to --- is: " + sum2);
        System.out.println("The average is: " + average);

        System.out.println("---------");

//то же самое, но через do while
        int sum3 = 0;
        int number3 = lowerbound;
        do {
            sum3 = sum3 + number3; //sum3+=number3; то же самое
            ++number3; //update
        } while (number3 <= upperbound);

        System.out.println("The sum of numbers from --- to --- is: " + sum3);

    }
}
