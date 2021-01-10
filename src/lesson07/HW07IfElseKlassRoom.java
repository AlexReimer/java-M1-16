package lesson07;
public class HW07IfElseKlassRoom {
    public static void main(String[] args) {
        trueWayOne("налево");
        System.out.println(trueWayTwo(3));
        trueWayThree(2);
    }

    private static void trueWayThree(int way) {
        switch (way) {
            case 1:
                System.out.println("вариант1");
                break;
            case 2:
                System.out.println("вариант2");
                break;
            case 3:
                System.out.println("вариант3");
                break;
            default:
                System.out.println("дефолтный вариант");
                break;
        }
    }

    private static String trueWayTwo(int way) {
        String result = "";
        if (way == 1) {
            result = "направо";
        } else if (way == 2) {
            System.out.println("налево");
        } else if (way == 3) {
            System.out.println("прямо");
        } else {
            System.out.println("кудато");
        }
        return result;
    }

    private static void trueWayOne(String way) {
        // if(way=="налево"){
        if (way.equals("налево")) {
            System.out.println("Колу найдёшь");
        } else if (way.equals("направо")) {
            System.out.println("Пиво найдёшь");
        } else if (way.equals("прямо")) {
            System.out.println("Водку найдёшь");
        } else {
            System.out.println("на работу пойдёшь");
        }
    }
}