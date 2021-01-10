package lesson25;

public class MyLovelyFebruaryArray2D {
    public static void main(String[] args) {
        //двумерный массив - календарь февраль
        int a = 5;
        int[] arr = new int[10];
        int[][] monthCalender = new int[4][7]; //массив 4 строки и 7 столбцов

        for (int outer = 0; outer < monthCalender.length; outer++) {
            for (int inner = 0; inner < monthCalender[outer].length; inner++) {
                monthCalender[outer][inner] = outer * 7 + inner + 1;
                System.out.print(monthCalender[outer][inner] + " ");
            }
            System.out.println();
        }
        System.out.println("plz computer give me element 2,5 - " + monthCalender[3][6]);
    }


}
