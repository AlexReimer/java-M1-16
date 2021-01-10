package lesson08;

public class ExampleFor {
    public static void main(String[] args) {
        example01 ();
    }

    private static void example01() {
        int a = 3;
        for (int i = 0; i < 10; i++) {
            // от нуля до 9, счет начинается с нуля, 10 кругов с шагом 1
            a++;
            System.out.println("а что тут происходит?");
        }
        System.out.println(a);
    }
}
