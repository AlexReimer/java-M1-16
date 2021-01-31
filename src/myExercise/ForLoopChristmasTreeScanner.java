package myExercise;

import java.util.Scanner;

public class ForLoopChristmasTreeScanner {
    public static void main(String[] args) {
        //рождественская елка с высотой, вводимой с консоли

        int treeHeight = 0;
        //  String symbolTree = "*";

        //ввод высоты дерева с консоли
        Scanner console = new Scanner(System.in);

        System.out.println("Enter tree height: ");
        treeHeight = console.nextInt();

        for (int i = 0; i < treeHeight; i++) {
            for (int j = 0; j < treeHeight - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.println("*");
            }
        }
        System.out.println();
    }
}
