package lesson16;

public class MultiplyTable {
    public static void main(String[] args) {
      //  Выведите на экран таблицу умножения, как показано ниже.
       mpTable(10);
        //multiplayTable (10);
    }

    /*
    private static void multiplayTable(int lines) {
        for (int i = 1; i < lines; i++) {
            for (int j = 1; j < lines; j++) {
                System.out.println("\t" + i + " " + "\t");
            }
            System.out.println();
        }
    }

     */

    private static void mpTable(int size) {
        for (int i = 1; i <= size; i++) {//здесь мы создали решетку/таблицу
            for (int j = 1; j <= size; j++) {
                String placeInTable = formatPlaceInMPTable(i, j);
                System.out.print(placeInTable);//без ln
            }
            System.out.println();
        }
    }

    private static String formatPlaceInMPTable(int i, int j) {
        String result = ""; // как вариант если мы возвращаем стринг, то неплохо вернуть
        int input = i * j;
        if (input < 10) {
            result = "  " + input; //здесь место для 100 забивает - два пробела
        } else if (input >= 100) {
            result = "" + input; //без пробела для 1-9
        }else{
            result = " " + input; // для 10-99
        }
        return result;
    }
}
