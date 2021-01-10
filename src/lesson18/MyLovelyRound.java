package lesson18;

//методы ОКРУГЛЕНИЯ
public class MyLovelyRound {
    public static void main(String[] args) {
        roundIntro();
        roundIntro2();
        roundIntro3();
        roundIntro4();
        intToLong();
    }

    private static void intToLong() {
        int a = 56;
        long l = a;
        long myL = 2857309457324055L;
        int b = (int) myL;
        System.out.println(b);
        //  2147483647 max integer
    }

    private static void roundIntro4() {
        // Округление вниз
        double number = 3.9;
        int newNumber = (int) number;
        System.out.println((double) newNumber);
    }

    private static void roundIntro3() {
        // Округлить вверх
        double inputNumber = 3.141;
        int temp = (int) inputNumber;
        double temp2 = temp;
        //System.out.println(temp2);
        if (inputNumber > temp2) {
            inputNumber = temp2 + 1;
        }
        System.out.println(inputNumber);
    }

    private static void roundIntro2() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

    private static void roundIntro() {
        double pi = Math.PI;
        // 3 цифры после запятой
        double tempPi = pi * 1000;
        System.out.println(tempPi);
        int magicInt = (int) tempPi;
        System.out.println(magicInt);
        pi = (double) magicInt / 1000;
        System.out.println(pi);
    }
}
