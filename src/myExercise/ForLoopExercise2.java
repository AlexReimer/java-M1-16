package myExercise;

import java.util.Scanner;

public class ForLoopExercise2 {
    public static void main(String[] args) {
        /*Write a program that reads a set of integers,
        and then prints the sum of the even and odd integers.
         */
        PrintSumOfEvenAndOdd();
    }

    private static void PrintSumOfEvenAndOdd() {
        Scanner console = new Scanner(System.in);
        int number;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter row of numbers: ");
        number = console.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("Sum of even Number: " + sumEven);
        System.out.println("Sum of odd Number: " + sumOdd);
    }
}

