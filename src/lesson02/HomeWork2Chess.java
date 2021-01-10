package lesson02;

public class HomeWork2Chess {
    public static void main(String[] args) {
        //даны 64 клетки
        //расчитать кол-во зерен когда на 1-й клетке одно
        //на каждой следующей в два раза больше, чем на предыдущей
        findQuantity();
    }

    public static void findQuantity() {
        int a1 = 1;
        int a2 = a1 * 2;
        int a3 = a2 * 2;
        int a4 = a3 * 2;
        int a5 = a4 * 2;
        int a6 = a5 * 2;
        long a7 = a6 * 2;
        long a8 = a7 * 2;
        //для удобства разбиваем на 8 блоков
        //блок b
        long b1 = a8 * 2;
        long b2 = b1 * 2;
        long b3 = b2 * 2;
        long b4 = b3 * 2;
        long b5 = b4 * 2;
        long b6 = b5 * 2;
        long b7 = b6 * 2;
        long b8 = b7 * 2;
        //блок c
        long c1 = b8 * 2;
        long c2 = c1 * 2;
        long c3 = c2 * 2;
        long c4 = c3 * 2;
        long c5 = c4 * 2;
        long c6 = c5 * 2;
        long c7 = c6 * 2;
        long c8 = c7 * 2;
        //блок d
        long d1 = c8 * 2;
        long d2 = d1 * 2;
        long d3 = d2 * 2;
        long d4 = d3 * 2;
        long d5 = d4 * 2;
        long d6 = d5 * 2;
        long d7 = d6 * 2;
        long d8 = d7 * 2;
        //блок e
        long e1 = d8 * 2;
        long e2 = e1 * 2;
        long e3 = e2 * 2;
        long e4 = e3 * 2;
        long e5 = e4 * 2;
        long e6 = e5 * 2;
        long e7 = e6 * 2;
        long e8 = e7 * 2;
        //блок f
        long f1 = e8 * 2;
        long f2 = f1 * 2;
        long f3 = f2 * 2;
        long f4 = f3 * 2;
        long f5 = f4 * 2;
        long f6 = f5 * 2;
        long f7 = f6 * 2;
        long f8 = f7 * 2;
        //блок g
        long g1 = f8 * 2;
        long g2 = g1 * 2;
        long g3 = g2 * 2;
        long g4 = g3 * 2;
        long g5 = g4 * 2;
        long g6 = g5 * 2;
        long g7 = g6 * 2;
        long g8 = g7 * 2;
        //блок h
        long h1 = g8 * 2;
        long h2 = h1 * 2;
        long h3 = h2 * 2;
        long h4 = h3 * 2;
        long h5 = h4 * 2;
        long h6 = h5 * 2;
        long h7 = h6 * 2;
        long h8 = h7 * 2;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        //
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        //
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        //
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);
        //
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
        System.out.println(e6);
        System.out.println(e7);
        System.out.println(e8);
        //
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);
        //
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);
        System.out.println(g7);
        System.out.println(g8);
        //
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
        System.out.println(h7);
        System.out.println(h8);

    }
}
