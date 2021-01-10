package myExercise;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, answer = 'Z';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read(); //получить символ с клавиатуры

        if (ch == answer) System.out.println("** Правильно! **");
            //работает и так, но не выдает сабжа об ошибке
            //поэтому добавляем оператор else - для вывода сабжа об ошибке
        else System.out.println("... Извините, вы не угадали.");
        //вложенный оператор if
        if (ch<answer)
            System.out.println("ближе к концу алфавита");
        else System.out.println("ближе к началу алфавита");

    }
}

