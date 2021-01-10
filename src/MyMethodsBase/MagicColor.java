package MyMethodsBase;

public class MagicColor {
    public static void main(String[] args) {
        myColorPrintTwo();
    }

    private static void myColorPrintTwo() {
        //final - финализирует переменную
        //можно без final. тогда переменная по конвенции пишем так: ansiReset
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        System.out.println(ANSI_CYAN + "Hello World" + ANSI_RESET);

        final String ANSI_BLACK_BACKGROUND = "\u001b[40m";
        final String ANSI_RED_BACKGROUND = "\u001b[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001b[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001b[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001b[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001b[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001b[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001b[47m";

        System.out.println(ANSI_BLUE_BACKGROUND + "THIS TEXT HAS A RED BACKGROUND BY DEFAULT TEXT"
                + ANSI_RESET);
        System.out.println(ANSI_GREEN + "THIS TEXT HAS A RED BACKGROUND BY DEFAULT TEXT"
                + ANSI_RESET);
        System.out.println(ANSI_RED + "THIS TEXT HAS A RED BACKGROUND BY DEFAULT TEXT"
                + ANSI_RESET);
//заканчивать нужно через команду reset, чтобы прекратило окрашивать
    }
}
