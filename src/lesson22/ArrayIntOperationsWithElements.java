package lesson22;

import MyMethodsBase.MyColorArray;

public class ArrayIntOperationsWithElements {
    public static void main(String[] args) {
        //1.дан массив длинной 5 элементов
        int[] arr = new int[]{5, 7, 8, 1, 3};//input из 12й строки
        // 99 нужно вставить перед 5 сдвинув все напрво
        int x = 99; //элемент из 12й сторчки)
        int index = arr.length / 2;
        //запуск метода в 11 и 12 строках делает
//        int [] variant1 = insertFirstElement (arr,x);
//        int [] variant2 = insertLastElement (arr,x);
        MyColorArray.myColorPrintIntArray(insertFirstElement(arr, x));//импорт метода распечатки массива и запуск метода
        MyColorArray.myColorPrintIntArray(insertLastElement(arr, x));//импорт метода распечатки массива
        MyColorArray.myColorPrintIntArray(insertSpecificIndexElement(arr, x, index));//импорт метода распечатки массива
        MyColorArray.myColorPrintIntArray(updateSpecificElement(arr, x, index));
        MyColorArray.myColorPrintIntArray(deleteElement(arr, index));
    }


    public static int[] deleteElement(int[] input, int index) {
        //Задача 5. удалить один из элементов (сократить массив)
        int[] output = new int[input.length - 1];//сокращаем массив на один элемент
        for (int i = 0; i < index; i++) { //цикл рабтает от 0 до index НЕВЛЮЧИТЕЛЬНО (здесь index = arr.length / 2;
            output[i] = input[i];
        }
        for (int i = index; i < output.length; i++) {//второй цикл работает от индекса ВКЛЮЧИТЕЛЬНО и до конца нового массива
            output[i] = input[i + 1];
        }
        return output;
    }

    public static int[] updateSpecificElement(int[] input, int element, int index) {
        //Задача 5.заменить одиниз элементов на новый (update провести)
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[index] = element;
        return output;
    }

    public static int[] insertSpecificIndexElement(int[] input, int element, int index) {
        //Задача 4.вставить еще один элемент в середину массива
        int[] output = new int[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index; i < input.length; i++) {
            output[i + 1] = input[i];
        }
        return output;
    }

    public static int[] insertFirstElement(int[] input, int element) {
        //Задача 2.вставить на 1-е место еще один элемент
        int[] output = new int[input.length + 1]; //создаем новый массив, увеличивая старый на 1 элемент
        output[0] = element;//сообщаем что 1е место в новом массиве (индекс 0) занимает новый элемент 99
        for (int i = 0; i < input.length; i++) { //элементы сарого массива мы переписываем в новый перебирая от 0 до длины length через цикл
            output[i + 1] = input[i]; // в старом массиве 1й элем. был на 0, то в новом он смещен на один. Нулевой индекс в нов.массиве занят 99 поэтому сдвигаем на 1
        }
        return output;
    }

    public static int[] insertLastElement(int[] input, int element) {
        //Задача 3.вставить на последнее место еще один элемент
        int[] output = new int[input.length + 1]; //создаем новый массив, увеличивая старый на 1 элемент
        output[output.length - 1] = element;//обращаемся к последнему элементу массива (length - 1) вставляя туда новый - 99
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

}
