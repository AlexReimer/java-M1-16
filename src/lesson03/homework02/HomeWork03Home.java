package lesson03.homework02;

public class HomeWork03Home {
    public static void main(String[] args) {
        //findCircleSquare ();
        findCircumFerence();
        findPercentSum();
        findAreaRelation();
    }

    public static void findCircleSquare() {
        int radius = 10;
        final double PI = 3.14;
        double javaPI = Math.PI;
        //final int MAX_TEMP = 16;
        double squareCircle = PI * radius * radius;
        System.out.println("squareCircle" + squareCircle);
        System.out.println("Пи из Мат.библиотеки Java" + javaPI);

    }

    public static void findCircumFerence() {
        //найти длину окружности l=PI*d
        int diameter = 15;
        final double PI = 3.14;
        double CircumFerence = PI * diameter;
        System.out.println("CircumFerence: " + CircumFerence);
    }

    public static void findPercentSum() {
        //найти сумму выплаты по вкладу под 3.5% на 7 лет
        int a = 1000;
        double b = 1.035;
        int c = 7;
        double percentsum = a * b * c;
        System.out.println("Ожидаемая выплата: " + percentsum + " евро");

    }

    public static void findAreaRelation() {
        //расчитать во сколько раз Москва больше Берина
        //Москва = 2511 кв.км
        //Берлин = 891.8 кв.км
        int moscowArea = 2511;
        double berlinArea = 891.8;
        double relation = moscowArea / berlinArea;
        System.out.println("Москва больше Берлина в " + relation + " раз/а");
    }
}
