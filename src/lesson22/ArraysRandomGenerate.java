package lesson22;

import MyMethodsBase.MyColorArray;

public class ArraysRandomGenerate {
    public static void main(String[] args) {
        int[] array = generateIntArray();
        //1)импортируем метод распечатки массива
        MyColorArray.myColorPrintIntArray(array);
        //2) импортируем метод, указывая полный путь (включая папку где лежит файл
        MyMethodsBase.MyColorArray.myColorPrintIntArray(array);

        //randomGenerate ();
    }


    public static int[] generateIntArray() {
        int ramdomLength = (int) (Math.random() * 25); //кастонули в int (IDEA предложила тк ) *25 длина диапазона (0-25) для рандома. без * число длина диапазона от 0 до1
        System.out.println(ramdomLength);
        //длина массива есть (сгенерили рандомом), создаем сам массив и он автоматом заполнятеся 0 в каждой ячейке
        int[] output = new int [ramdomLength];
        //заполняем массив значениями вместо нулей
        //через цикл (только НЕ foreach - для инициализации чего-либо они не работает)
        for (int i = 0; i < output.length; i++) {
            output [i] = (int) (Math.random()*25);
        }
        return output;
    }

    public static int randomGenerate(int size) {
        int myValue = (int) (Math.random()*size);
        if (myValue < 5) {
            myValue =4;
        }
        return myValue;
    }

}
