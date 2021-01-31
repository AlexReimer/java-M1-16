package myExercise;

import java.util.Scanner;

public class ForLoopChristmasTree {
    public static void main(String[] args) {
        //переменные декларировать и инициализировать

        int treeHeight = 7;

//        Scanner console = new Scanner(System.in);
//        System.out.println("Enter tree height: ");
//        treeHeight = console.nextInt();

        for (int i = 0; i < treeHeight; i++) {
            for (int j = 0; j < treeHeight - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
