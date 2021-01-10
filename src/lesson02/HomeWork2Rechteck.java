package lesson02;

import java.sql.SQLOutput;

public class HomeWork2Rechteck {
    public static void main(String[] args) {
        //дан прямоугольник со строронами 4 и 6
        //найти площать и периметр
        findPerimetr();
        findSquare();
    }

    public static void findPerimetr() {
        int a = 4;
        int b = 6;
        int perimeter = (a * 2) + (b * 2);
        System.out.println("периметр прямоугольника равен: " + perimeter);
    }

    public static void findSquare() {
        int a = 4;
        int b = 6;
        int square = a * b;
        System.out.println("площадь прямогульника равна: " + square);
    }
}
