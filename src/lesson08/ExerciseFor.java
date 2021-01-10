package lesson08;

public class ExerciseFor {
    public static void main(String[] args) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        int a = 10;
        int b = 20;
        printA(a, b);
        printA(7, 8);

    }

    public static void printA(int a, int b) {
        System.out.println();//без значения в скобках, потому что здесь sout
        // только чтобы создать новую строку. можно также через \n (\n a + " ")
        for (int i = 0; i < b; i++) {
            System.out.print(a + " ");
        }
    }
}
