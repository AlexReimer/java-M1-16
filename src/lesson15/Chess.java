package lesson15;

public class Chess {
    public static void main(String[] args) {
        chess(8);

    }

    private static void multiplyTable(int lines) {
        /* Выведите на экран таблицу умножения, как показано ниже.
        1  2  3  4  5  6  7  8  9 10
        2  4  6  8 10 12 14 16 18 20
        3  6  9 12 15 18 21 24 27 30
        4  8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
        6 12 18 24 30 36 42 48 54 60
        7 14 21 28 35 42 49 56 63 70
        8 16 24 32 40 48 56 64 72 80
        9  18 27 36 45 54 63 72 81 90
        10 20 30 40 50 60 70 80 90100

         */
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print(i * j + " ");//убрали -ln in print
            }
            System.out.println();
        }
    }

    private static void chess(int line) {
        /*Выведите на экран в шахматном порядке символы.
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
        #-#-#-#-
         */
        for (int i = 0; i < line; i++) { // цикл в цикле т.к. один раз строчка, затем сл.строчка
            for (int j = 0; j < line / 2; j++) {
                //делим на 2 потому что длина строки 8,
                // но даны два символа -> 2*8=16,а надо 8 симвлов. поэтому делим на 2, чтоюы получить 8
                String place = formatChess(i, j);
                System.out.print(place);
            }
            System.out.println();
        }
    }

    private static String formatChess(int i, int j) {
        String result = "";
        String hashtag = "#";
        String minus = "-";
        if (i % 2 != 0 && j % 2 != 0) {
            result = hashtag;
        } else if (i % 2 == 0 && j % 2 == 0) {
            result = hashtag;
        } else {
            result = minus;
        }
        return result;
    }
}