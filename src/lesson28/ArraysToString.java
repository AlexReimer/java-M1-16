package lesson28;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        int size = 10;
        int[] array = createArray(size);
        int max = findMax(array);
        int min = findMin(array);
        int sum = findSum(array);
        int middle = sum / array.length; // size
        System.out.println("Наш массив " + Arrays.toString(array));
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальное значение " + min);
        System.out.println("Сумма всех элементов массива " + sum);
        System.out.println("Среднее значение элемента массива " + middle);
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    private static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }

}
