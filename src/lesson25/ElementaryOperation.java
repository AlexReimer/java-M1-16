package lesson25;

public class ElementaryOperation {
    public static void main(String[] args) {
        int[] arr = myLovelyRandom(10);
        int[] arr1 = new int[0];
        int[] arr2 = new int[]{3, 5};
        printArray(arr);

        System.out.println(minValueinArray(arr));
        System.out.println(maxValueInArray(arr));
        System.out.println(minValueinArray(arr));
        maxValueInArray(arr);
        sumElementArray(arr);
        middleValueElementInArray(arr);
    }

    private static double middleValueElementInArray(int[] arr) {
        //сложить
        //разделить
        //сумма у нас уже есть в другом методе. берем ее там
        double sum = sumElementArray(arr);
        return sum / arr.length;
    }


    private static int sumElementArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return 0;
    }


    private static String maxValueInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return "ьфксимальное значение" + max;
    }


    private static String minValueinArray(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);

        }
        return "минимальное значение в массиве" + min;
    }

    private static void printArray(int[] input) {
        for (int element : input) {
            System.out.println(element + "");
        }
        System.out.println();
    }

    private static int[] myLovelyRandom(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
