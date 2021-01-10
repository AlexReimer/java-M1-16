package lesson21;

import lesson20.Main;

public class ArrayExercise {
    public static void main(String[] args) {

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 3, 5};
        int[] a3 = new int[]{1, 2, 1};
       /*ниже обращаемся к методу распечатки массив,
       созданному в уроке 20
        */
        Main.printArrayForEach(fix23(a1));//[1, 2, 0]
        Main.printArrayForEach(fix23(a2));//[2, 0, 5]
        Main.printArrayForEach(fix23(a3));//[1, 2, 1]

        System.out.println("__________");

        int[] b1 = new int[]{1,2,3,43};
        int[] b2 = new int[]{7,1,2,3,4,9};
        int[] b3 = new int[]{1, 2};
        Main.printArrayForEach(makeMiddle(b1));//[2, 3]
        Main.printArrayForEach(makeMiddle(b2));//[2, 3]
        Main.printArrayForEach(makeMiddle(b3));//[1, 2]

        System.out.println("__________");

    }

    public static int [] makeMiddle (int [] input) {
        /*Given an array of ints of even length, return
        a new array length 2 containing the middle two elements
        from the original array. The original array will be length 2 or more.
         */
        int [] output = new int [2]; //размер массива указываем сразу
        output [0] = input[input.length/2-1];
        output [1] = input[input.length/2];
        return output;
    }


    private static int[] fix23(int[] input) {
        /*Given an int array length 3, if there is a 2 in
        the array immediately followed by a 3, set the 3 element to 0.
        Return the changed array.
         */
        if (input[0] == 2 && input[1] == 3) {
            input[1] = 0;
        }else if (input[1]==2 && input[2]==3){
            input[2]=0;
        }
        return input;
    }
}
