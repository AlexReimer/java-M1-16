package lesson04;

public class Exercise05 {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); //Hello Bob!
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Василий"));
    }

    public static String helloName (String name) {
        return "Hello " + name + "!";

    }
}
