package lesson17;

import java.util.Scanner;

public class HomeWork17 {
    public static void main(String[] args) {
        personalData();
        persDataAgeBack();

    }

    private static void persDataAgeBack() {
        /*
        программу, которая принимает из "сканера" возраст человека
        в строке и отдаёт его в вашу переменную
        int. В четвёртой главе(char, String) мы коротко рассматривали
        один из способов передачи такой информации.
        */
        Scanner inData = new Scanner(System.in);
        System.out.println("Hello, I'm Mina. And what's your full name?");
        String person = inData.nextLine();
        System.out.println("Hello " + person + "." + " How old are you?");
        //inData.next();//лишняя стока
        String age = inData.nextLine();
        System.out.println(person + ", you are already " + age + " years old. So what?");


    }

    private static void personalData() {
        /*
        программу, которой надо представиться.
        Данные, которые спрашивает машина: имя, фамилия, пол,
        возраст, e-mail. Для считывания данных типа String
        используйте метод next(): input.next()
         */
        Scanner inData = new Scanner(System.in);
        System.out.println("Hello, I'm Mina. And what's your name?");
        String person = inData.nextLine();
        System.out.println("Great " + person + "." + " And what is your full name?");
        inData.next();
        System.out.println("Nice to meet you. " + "Enter your gender, please.");
        inData.next();
        System.out.println("How old are you?");
        inData.next();
        System.out.println("Thanks. I need your e-mail address to communicate you.");
        inData.next();
        System.out.println("Wonderful. See you soon " + person + " ;)");
        inData.next();
    }
}
