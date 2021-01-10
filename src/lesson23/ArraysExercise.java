package lesson23;

public class ArraysExercise {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};

        /*System.out.println(unlucky1(arr1)); //-> true
        System.out.println(unlucky1(arr2)); //→ true
        System.out.println(unlucky1(arr3)); //→ false*/

        int[] var1 = new int[]{1, 2, 3};
        int[] var2 = new int[]{1, 2, 3, 1};
        int[] var3 = new int[]{1, 2, 1};
/*
        System.out.println(sameFirstLast(var1));// → false
        System.out.println(sameFirstLast(var2));// → true
        System.out.println(sameFirstLast(var3));// → true*/

        int[] var4 = new int[]{1, 2, 3};
        int[] var5 = new int[]{5, 11, 2};
        int[] var6 = new int[]{7, 0, 0};
        int[] var7 = new int[]{7, 0, 0, 12};


        System.out.println(sum3(var4));// → 6
        System.out.println(sum3(var5));// → 18
        System.out.println(sum3(var6));// → 7
        System.out.println(sum3(var7));// → 19

    }

    private static int sum3(int[] arr) {
        /*Given an array of ints length 3, return the sum of all
        the elements.
         */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static int sum3Simple(int[] input) {
         /*Given an array of ints length 3, return the sum of all
        the elements.
         */
        int sum = input[0] + input[1] + input[2];
        return sum;
    }

    private static boolean sameFirstLast(int[] input) {
        /*Given an array of ints, return true if the array is
        length 1 or more, and the first element and the last element are equal.
         */
        return input[0] == input[input.length - 1] && input.length >= 1;
    }

    private static boolean unlucky1(int[] array) {
        /*We'll say that a 1 immediately followed by a 3 in an array
        is an "unlucky" 1. Return true if the given array contains
        an unlucky 1 in the first 2 or last 2 positions in the array.
         */
        // 1. Проверяем, наход. на 0 индексе 1
        // 2. Если на 0 индексе таки 1, то проверяем на индексе (0+1) нахождение 3, если нашли то true
        // 3. Повторяем первые 2 действия на индексе 1 и  array.lenght-1 & array.lenght-2
        if (array[0] == 1 && array[1] == 3) {
            return true;
        }
        if (array[1] == 1 && array[2] == 3) {
            return true;
        }
        if (array[array.length - 2] == 1 && array[array.length - 1] == 3) {
            return true;
        }
        return false;
    }

}

