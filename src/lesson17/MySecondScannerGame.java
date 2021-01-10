package lesson17;

import java.util.Scanner;

public class MySecondScannerGame {
    public static void main(String[] args) {
        /*Компьютер загадывает число от 1 до n.
        У пользователя k попыток отгадать.
        После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
        В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
         */
        // 1. комп генерирет число
        //2.Бизнес логика игры
        //3.доавляем сканнер волшебный диалоговый
        //System.out.println(generateDigit());
        game ();
    }

    private static void game() {
        Scanner input = new Scanner(System.in);
        int digit = generateDigit();
        System.out.println("Say the number from 0 to 100");
        int number = input.nextInt();
        System.out.println(compareNumbewrs(number, digit));
        while (number!=digit){
            number = input.nextInt();
            System.out.println(compareNumbewrs(number, digit));
        }
        System.out.println("AAA");
    }

    private static String compareNumbewrs (int number, int digit){
        if (number==digit){
            return "bingo";
        }else if (number>digit){
            return "number>digit";
        }else {
            return "return<digit";
        }

    }

    public static int generateDigit (){
        return (int) (Math.random()*100);
//(max-min)+1+min это Math.random
    }
}
