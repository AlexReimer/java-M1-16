package lesson02;

public class HomeWork2Square {
    public static void main(String[] args) {
        //дан квадрат со стороной 15
        //найти перимерт и площадь
        findPerimeter();
        findSquare();
    }

    public static void findPerimeter() {
        int a = 15;
        int perimeter = a * 4;
        System.out.println("периметр квадрата равен: " + perimeter);
    }

    public static void findSquare() {
        int a = 15;
        int square = a * a;
        System.out.println("площадь квадрата равна: " + square);
    }
}
