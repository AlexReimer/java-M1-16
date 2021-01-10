package lesson10;

public class HomeWorkExample {

    public static void main(String[] args) {
        System.out.println(leapYaer(2000));//true
        System.out.println(leapYaer(2021));//false
        System.out.println(leapYaer(1995));//false
        System.out.println(leapYaer(2020));//true
    }

    private static boolean leapYaer(int year) {
        /*//Напишите программау,
    //проверяющую год на високосность.
    //Кратный четере
         */
        return year %4 == 0;
    }
}
