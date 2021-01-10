package lesson06;

public class HelloZinaSwitch {
    public static void main(String[] args) {
        salesPermissionTwo(10);
    }


    public static String salesPermissionThree(int age) {
        String result = "";
        if (age < 16) {
            result = "Мал ещё!";
        }
        else if (age >= 16 && age < 18) {
            result = "Пиво продавать можно";
        }
        else if (age < 21) result = "Кроме водки";
        else result = "Продавать можно всё";
        return result;
    }


    public static void salesPermissionTwo(int age) {
        if (age < 16) {
            System.out.println("Мал ещё!");
        } else if (age >= 16 && age < 18) {
            System.out.println("Пиво продавать можно");
        } else if (age < 21) {
            System.out.println("Кроме водки");
        } else {
            System.out.println("Продавать можно всё");
        }
    }


    public static String salesPermissionOne(int age) {
        String result = "";
        if (age > 18) {
            result = "Продавать можно";
        } else {
            result = "Продавать NE можно";
        }
        return result;
    }
}

