package lesson22;

import MyMethodsBase.MyColorArray;

public class ArrayAdditionOfArrays {
    public static void main(String[] args) {
        //1.дано два интовых массива
        int[] var1 = new int[]{1, 5, 10};
        int[] var2 = new int[]{6, 7, 9};
        MyColorArray.myColorPrintIntArray(arrayConcatenation(var1, var2));
        MyColorArray.myColorPrintIntArray(arrayElementSum(var1,var2));
    }

    public static int[] arrayElementSum(int[] a, int[] b) {
        //3.задача сложить значения элементов двух массивов
        int length = 0;
        if (a.length > b.length) {
            length = a.length;
        } else {
            length = b.length;
        }
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            output [i] = a [i] + b[i];
        }
        return output;
    }

    public static int[] arrayConcatenation(int[] a, int[] b) {
        //2.конкатинируем два массива:один вагончик цепляем ко вторму
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = a.length; i < output.length; i++) {
            output[i] = b[i - a.length];
        }
        return output;
    }
}
