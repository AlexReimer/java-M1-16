package lesson21;

public class HW_Korr_rubelEnding {
    public static void main(String[] args) {
        printSumInRub(1, 99);
        printSumInRub(1, 5);
        printSumInRub(15, 23);
        printSumInRub(15, 23);

        System.out.println(myLovelyCharAt(4, "Василий"));
        System.out.println(myLovelyCharAt(2, "Arnold"));

        String hausmaster = "Василий";
        char[] magicArray = hausmaster.toCharArray();
        myCharPrint(magicArray);
    }

    public static void myCharPrint(char[] input) {
        System.out.print("[");
        for (char symbol : input) {
            System.out.print(symbol + " ");
        }
        System.out.println("]");
    }

    private static String myLovelyCharAt(int index, String word) {
        // букву под индексом
        return word.substring(index, index + 1);
    }


    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println("Всего получено " + i + " " + formatRub(i));
        }
    }

    private static String formatRub(int rub) {
        String output = "";
        int remainder10 = rub % 10;
        if (rub > 10 && rub < 15) {
            output = "рублей";
        } else if (remainder10 == 1) {
            output = "рубль";
        } else if (remainder10 == 2 || remainder10 == 3 || remainder10 == 4) {
            output = "рубля";
        } else {
            output = "рублей";
        }
        return output;
    }
}
