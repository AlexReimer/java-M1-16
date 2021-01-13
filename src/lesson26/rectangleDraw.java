package lesson26;

public class rectangleDraw {

    public static void main(String[] args) {
        rectangleDraw (5,7);
    }

    public static void rectangleDraw (int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(i + "*");

            }

        }
    }

}
