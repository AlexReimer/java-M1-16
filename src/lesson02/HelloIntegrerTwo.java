package lesson02;

public class HelloIntegrerTwo {
    public static void main(String[] args) {
        // helloInt();//объявляем методы !!!
        helloByte();//делаем их неактивными через слэш
        helloShort();
        magicNumber();
    }//закрываем метод!!!

    public static void magicNumber() {
        int hexValue = 0x100;
        int binary = 0B1001_1001;
        int octal = 0757;
    }

    public static void helloShort () {
        short a = 23432;
        short b = 2423;
        short c = (short) (a + b);
        System.out.println(c);
    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f); //ошибка
        System.out.println(e);
    }

    public static void helloInt() {
        int a = 6;
        System.out.println("ожидаю шесть: " + a);
        int b = 3;
        System.out.println(a + b);
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);

    }
}
