package myExercise;

import java.util.Scanner;

public class ForLoopExercise {
    private static Object String;

    public static void main(String[] args) {

        //   ReverseNumberFor(123456789);

         /*Write a program that prompts the user to input an integer and then outputs
        the number with the digits reversed. For example, if the input is 12345,
        the output should be 54321.
         */
        // ReverseNumberWhileKeyBoard();
        ReverseNumberForKeyBoard();

        ReverseNumberWhile();
//        SumNaturalTenNumbers();
//         PrintOneToTen();

    }

    private static void ReverseNumberForKeyBoard() {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int reversed = 0;

        System.out.println("Enter the number you want to reverse: ");
        number = keyboard.nextInt();
        for (int i = 0; number != 0; ) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
            //  number /=10; // то же самое, что и number = number /10;
        }
        System.out.println("Reverse of your number is:" + "\n" + reversed);
    }

    private static void ReverseNumberWhileKeyBoard() {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int reversed = 0;

        System.out.println("Enter the number you want to reverse: ");
        number = keyboard.nextInt();

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.println("Your reversed number is: " + "\n" + reversed);
    }

    private static void ReverseNumberFor(int n) {

        int num = n, reversed = 0;
        for (; num != 0; ) { //fori можно и так, без Начала (int i = 0) и Шага (i++) они здесь не нужны
            //-> 12345/10=1234,5 последняя цифра в num; модула 10 от 12345 будет 5 (остаток целочисленного деления на 10): 12345/10=1234,5
            int digit = num % 10;
            reversed = reversed * 10 + digit; //1.итерация: reversed = 0 * 10 + digit (цифра после запятой в результате модула
            //отрезает последнюю цифру инта в каждой итерации, т.к.
            // при делении 12345 на 10 получается 1234,5, а инт целое число и следующем круге будет 1234
            num = num / 10;
        }
        System.out.println(reversed);
    }

    public static void ReverseNumberWhile() {
        /*Write a program that prompts the user to input an integer and then outputs 
        the number with the digits reversed. For example, if the input is 12345, 
        the output should be 54321.
         */
        int num = 12345;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;//-> 5; модула 10 от 12345 будет 5 (остаток целочисленного деления на 10)
            reversed = reversed * 10 + digit;
            //отрезает последнюю цифру инта в каждой итерации, т.к.
            // при делении 12345 на 10 получается 1234,5, а инт целое число и следующем круге будет 1234
            num /= 10;
        }
        System.out.println("Reversed Number:" + reversed);

    }
//
//        /*Write a program to calculate the sum of first 10 natural number.*/
//    private static void SumNaturalTenNumbers() {
//        int sum = 0;
//        for (int i = 0; i <= 10; ++i) {
//            sum = sum + i;
//            // sum += i; то же самое
//        }
//        System.out.println("Sum: " + sum);
//    }
//
//        /*Write a program to print numbers from 1 to 10.*/
//    public static void PrintOneToTen() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//    }
}

