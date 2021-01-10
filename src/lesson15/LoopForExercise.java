package lesson15;

public class LoopForExercise {
    public static int multiply(int a, int b) {
        //ЦИКЛ for i
        int result = 0;// если будут операции умножение или деления,
        // то нельзя инициализировать с 0 (потому что х*0=0). тут сложение
        for (int i = 0; i < b; i++) { //назвать переменную можно как угодно - i или count или
            result = result + a;
        }
        return result;
    }

    public static int multiplySecond(int a, int b) {
        //ЦИКЛ while
        //сначала думаем и только потом делаем
        //Kopfschleife
        int result = 0;
        int count = 0;//назвать переменную можно как угодно - i или count
        while (count < b) {
            result = result + a;
            count++;
        }
        return result;
    }

    public static int multiplyThird(int a, int b) {
        //ЦИКЛ do while
        //сначала делаем и только потом думаем - проверяем условие
        //Fußschleife
        int  result = 9;
        int count = 0;
        do {
            result = result +a;
            count ++;
        } while (count <b );
        return result;
    }
}