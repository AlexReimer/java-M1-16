package lesson17;

import java.util.Scanner;

public class HW17Korrektur {
    public static void main(String[] args) {
        introduceYourSelf ();
    }

    private static void introduceYourSelf() {
        String firstname, secondName, gender, email;
        int age;
        Scanner inputTemp = new Scanner(System.in);
        System.out.println("Your age plz!");
        age = inputTemp.nextInt();
        System.out.println("Your firstname");
        firstname = inputTemp.next();//после использхования переменной в age
        System.out.println("Secondname");
        secondName = inputTemp.next();
        System.out.println();


    }
}
