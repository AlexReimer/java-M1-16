package lesson04;

public class HelloString {
    public static void main(String[] args) {
        magicString();
        london();
        jamesBond();
    }

    public static void magicString() {
        String firstName = "Alexander";
        String secondName = "Reimer";
        String user = firstName + secondName;
        int age = user.length();
        System.out.println(age);
        String welcomeMessage = firstName + " " + secondName + "\t" + age;
        System.out.println(welcomeMessage);
        String first10Chars = user.substring(0, 8);
        System.out.println(first10Chars);
    }

    public static void london() {
        String myLife = "London is the capital of Great Britain";
        System.out.println(myLife);
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.toLowerCase());
        //первая буква БОЛЬШАЯ, остальные маленькие
        System.out.println(myLife.substring(0, 1).toUpperCase() +
                myLife.substring(1).toLowerCase());
        String game = myLife.substring(0, 2).toLowerCase() +
                myLife.substring(2, 4).toUpperCase() +
                myLife.substring(4, 6).toUpperCase() +
                myLife.substring(6,8).toUpperCase();
        System.out.println(game);
    }

    public static void jamesBond() {
        String userFirstNama = "James";
        String euro = "€";
        char euro2 = '€';
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(
                userFirstNama + " "
                        + userSecondName
                        + "\t" + age);
        String massege = userFirstNama + " " + userSecondName + "\t" + age;
        System.out.println(massege);
    }
}
