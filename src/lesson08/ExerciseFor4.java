package lesson08;

public class ExerciseFor4 {
    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    public static void main(String[] args) {
        modula3();
    }

    private static void modula3() {

        for (int i = 0; i < 100; i++) {
            if (i % 3==0){
                System.out.println(i + " делиться на 3 без остатка");

            }
        }
    }
}
