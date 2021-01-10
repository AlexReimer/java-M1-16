package lesson04;

public class MyErrors {

    public static void main(String[] args) {
        //1.int a, b, PI;
        int a, b;
        final double pi = 3.14;

        //2.double радиус = 10;
        double radius = 121897;

        //3.int PI = (int) Math.PI
        double PI = Math.PI;
        System.out.println(PI);

        //4.int SP = 7643;
        // нельзя БОЛЬШИМИ переменную
        // либо надо финализироывать !!
        final int SP = 7643;
    }
}
