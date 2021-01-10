package lesson16;

public class CoffeeMachine {

    public static void cappuccino() {
        System.out.println("Капучино готов");
        milk(30);
        hotWatter(20);
        coffee(40);
        System.out.println("Мешок с костями");
    }

    public static void latte() {
        System.out.println("MilchKaffee готов");
        milk(40);
        hotWatter(70);
        coffee(30);
    }

    public static void americano() {
        System.out.println("Американо готов");
        //milk(0);
        hotWatter(100);
        coffee(20);
        System.out.println("----");
    }

    public static void tee() {
        hotWatter(100);
        System.out.println("Возьмите ваш пакетик чая из правого бокса");
    }

    public static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void hotWatter(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }
}
