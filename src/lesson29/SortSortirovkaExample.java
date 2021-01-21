package lesson29;

import java.util.Arrays;

public class SortSortirovkaExample {
    public static void main(String[] args) {
        //Сортировка массива
        int[] arr = new int[]{45, 12, 0, 56, -5, 100, 100, 7, 4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] input) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    count++;
                }

            }

        }

    }
}
