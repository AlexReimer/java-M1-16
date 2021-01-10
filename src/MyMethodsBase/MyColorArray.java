package MyMethodsBase;

public class MyColorArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] arr3 = new int[]{1, 2, 3};
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        //final String ANSI_PURPLE_BACKGROUND = "\u001b[45m";
        final String ANSI_RESET = "\u001b[46m";

        /* ниже обращаемся к методу распечатки массива,
        созданному в уроке 20 */
//        Main.printArrayForEach(midThree(a1));//[2, 3, 4]
//        Main.printArrayForEach(midThree(a2));//[7, 5, 3]
//        Main.printArrayForEach(midThree(a3));//[1, 2, 3]

        // еще один способ распечатать массив.
        // в данном случае в разные цвета каждый массив
        System.out.println(ANSI_RED);
        myColorPrintIntArray(midThree(arr1));// → [2, 3, 4]
        System.out.println(ANSI_GREEN);
        myColorPrintIntArray(midThree(arr2));// → [7, 5, 3]
        System.out.println(ANSI_YELLOW + ANSI_RESET);
        myColorPrintIntArray(midThree(arr3));// → [1, 2, 3]

        System.out.println("__________");

    }

    //создаем метод для  распечатки (цветной)
    public static void myColorPrintIntArray (int [] input) {
        //сперва обычная распечатка
        System.out.print("[");
        //как внизу написано, ведет к распечатке лишней запятой после цифр и лишнему пробелу
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input [i] + ", ");
        // так лишнее не печатает (-1): печатем без последнего элемента. его в последнюю sout вносим
        for (int i = 0; i < input.length -1; i++) {
            System.out.print(input [i] + ", ");
        }
        //как внизу написано, ведет к распечатке лишней запятой после цифр и лишнему пробелу
        //System.out.println("]");

        //так меняем - чтобы последней элемент без лишней запятой распечателся
        System.out.println(input [input.length - 1] + "]");
    }

    public static int[] midThree(int[] arr) {
        /*Given an array of ints of odd length, return a new array
        length 3 containing the elements from the middle of the array.
        The array length will be at least 3.*/
        int[] output = new int[3];
        output[0] = arr[arr.length / 2 - 1];
        output[1] = arr[arr.length / 2];
        output[2] = arr[arr.length / 2 + 1];
        return output;
    }

}
