package lesson20;

public class MyLovelyGeometry {
    public static void main(String[] args) {
        firstTriangle(10);

        System.out.println("__________");

        secondTriangle(15);
    }

    private static void secondTriangle(int line) {
        String stroka = "";
        String star = "*";
        for (int y = line - 1; y >=0 ; y--) {
            stroka = stroka + star;
            System.out.println(stroka);

        }


    }

    private static void firstTriangle(int line) {
        //"Нарисуйте/выведите в консоль" треугольник из звёздочек
        // используя только одну звёздочку и то что только что изучили:
        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         **********
         */

        String stroka = "";
        String star = "*";
        //stroka += star;
        for (int i = 0; i < line; i++) {
            stroka = stroka + star;
            System.out.println(stroka);
        }
    }
}

