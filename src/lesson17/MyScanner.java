package lesson17;


import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner magicInput = new Scanner(System.in); //как хочешь инпут называй хть инпут хочь как
        int age;
        System.out.println("Сколько тебе лет?: ");
        age = magicInput.nextInt();
        System.out.println("как заовут тебя");
        String custumerName;
        custumerName = magicInput.next ();
        System.out.println("А ты уверен " + "что тебе" + age + "лет");
    }
}
