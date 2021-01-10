package lesson04.HW04;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println(giveMeLengthCircle(45.5));
        System.out.println(giveMeLengthCircle( 15));
        System.out.println(giveMeLengthCircle( 7.8));

    }

    public static double giveMeLengthCircle (double radius){
        double pi = 3.14;
        double length = 2 * pi * radius;
        return length;
    }
}
