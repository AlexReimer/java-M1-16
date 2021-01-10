package lesson23;

public class HWDoubleArrayOperations {
    public static void main(String[] args) {
        //double[] array1 = new double[10];
        //double[] testArray = new double[]{1.5, 5.6, 7.8, 1.0};
        //print(testArray);
        double[] array = createArray(10);
        print(array);
        double[] resultArray02 = insertNewElement(array, 5, 3.14);
        print(resultArray02);
        double[] anotherArray = insertNewElement(resultArray02, 10, 0.0);
        print(anotherArray);
        double[] resultArray03 = updateElementNewArray(array, 3, 100.23456);
        print(resultArray03);
        // изменяем старый массив
        updateElementOldArray(array, 7, 33.3333);
        print(array);
        double[] resultArray04 = deleteElement(array, 8);
        print(resultArray04);
    }

    private static double[] deleteElement(double[] array, int index) {
        double[] result = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        /*for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }*/

        for (int i = index + 1; i < array.length; i++) {
            result[i - 1] = array[i];
        }
        return result;
    }

    private static double[] updateElementNewArray(double[] array, int index, double newElement) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = newElement;
        return newArray;
    }

    private static void updateElementOldArray(double[] array, int index, double newElement) {
        array[index] = newElement;
    }

    private static double[] insertNewElement(double[] array, int index, double newElement) {
        double[] result = new double[array.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = newElement;
        for (int i = index + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }

    private static double randomDoubleNumber(int range) {
        return round(Math.random() * range);
    }

    private static double round(double input) {
        double output = 0.0;
        int cooficient = 100;
        double temp1 = input * cooficient;
        int temp2 = (int) temp1;
        output = temp2;
        output /= 100;
        return output;
    }

    private static double[] createArray(int size) {
        double[] result = new double[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = randomDoubleNumber(100);
        }
        return result;
    }

    private static void print(double[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(format(array[i]) + ", ");
        }
        System.out.print(format(array[array.length - 1]));
        System.out.println("]");
    }

    private static String format(double var) {
        final String ANSI_RESET = "\u001B[0m";
        String result = "" + var + ANSI_RESET;

        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        int input = (int) var;
        int myModuloTen = input % 10;
        if (myModuloTen == 0) {
            result = ANSI_CYAN + result;
        } else if (myModuloTen == 1) {
            result = ANSI_RED + result;
        } else if (myModuloTen == 2) {
            result = ANSI_GREEN + result;
        } else if (myModuloTen == 3) {
            result = ANSI_YELLOW + result;
        } else if (myModuloTen == 4) {
            result = ANSI_BLUE + result;
        } else if (myModuloTen == 5) {
            result = ANSI_PURPLE + result;
        } else if (myModuloTen == 6) {
            result = ANSI_WHITE + ANSI_PURPLE_BACKGROUND + result;
        } else if (myModuloTen == 7) {
            result = ANSI_RED + ANSI_BLUE_BACKGROUND + result;
        } else if (myModuloTen == 8) {
            result = ANSI_BLUE + ANSI_GREEN_BACKGROUND + result;
        } else {
            result = ANSI_YELLOW + ANSI_RED_BACKGROUND + result;
        }
        return result;
    }
}
