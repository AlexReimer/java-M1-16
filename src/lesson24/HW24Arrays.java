//package lesson24;
//
//import MyMethodsBase.MyColorArray;
//
//public class HW24Arrays {
//    public static void main(String[] args) {
////        /*Given 2 int arrays, each length 2,
////        return a new array length 4 containing all their elements */
////        int[] arr1 = new int[]{1, 2};
////        int[] arr2 = new int[]{3, 4};
////        int[] arr3 = new int[]{4, 4};
////        int[] arr4 = new int[]{2, 2};
////        int[] arr5 = new int[]{9, 2};
////        int[] arr6 = new int[]{3, 4};
////
////        MyColorArray.myColorPrintIntArray(plusTwo(arr1, arr2));// → [1, 2, 3, 4]
////        MyColorArray.myColorPrintIntArray(plusTwo(arr3, arr4));// → [4, 4, 2, 2]
////        MyColorArray.myColorPrintIntArray(plusTwo(arr5, arr6));// → [9, 2, 3, 4]
////
////        System.out.println("__________");
////
////        /*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array
////        length will be a least 1.*/
////        int[] var1 = new int[]{1, 2, 3};
////        int[] var2 = new int[]{1, 5, 3};
////        int[] var3 = new int[]{5, 2, 3};
////
////        System.out.println(maxTriple(var1));// →3
////        System.out.println(maxTriple(var2));// →5
////        System.out.println(maxTriple(var3));// →5
//
//        System.out.println("__________");
//
//        /*Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the
//        elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2
//        arrays*/
//
//        int[] var3_1 = new int[]{4, 5};
//        int[] var3_2 = new int[]{1, 2, 3};
//        int[] var4_1 = new int[]{4};
//        int[] var4_2 = new int[]{1, 2, 3};
//        int[] var5_1 = new int[]{};
//        int[] var5_2 = new int[]{1, 2, 3};
//
//        MyColorArray.myColorPrintIntArray(make2(var3_1, var3_2));//→ [4, 5]
//        MyColorArray.myColorPrintIntArray(make2(var4_1, var4_2));//→ [4, 1]
//        MyColorArray.myColorPrintIntArray(make2(var5_1, var5_2));//→ [1,2]
//
//        System.out.println("__________");
//    }
//
//    public static int[] make2(int[] a, int[] b) {
//        int[] output = new int[2];
//        if (a.length == 0) {
//            output[0] = b[0];
//            output[1] = b[1];
//        }
//        if (a.length == 1) {
//            output[0] = a[0];
//            output[1] = b[0];
//        }
//        if (a.length > 1) {
//            output[0] = a[0];
//            output[1] = a[1];
//
//        if (b.length == 0) {
//            output[0] = a[0];
//            output[1] = a[1];
//        }
//        return output;
//    }
//
//    private static int maxTriple(int[] array) {
//        int max1_3 = Math.max(array[0], array[2]);
//        int max2_1 = Math.max(array[array.length / 2], array[0]);
//        return Math.max(max1_3, max2_1);
//    }
//
//    public static int[] plusTwo(int[] var1, int[] var2) {
//        int[] output = new int[4];
//        return new int[]{var1[0], var1[1], var2[0], var2[1]};
//    }
//}
