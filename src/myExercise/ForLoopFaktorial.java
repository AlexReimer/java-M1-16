package myExercise;

public class ForLoopFaktorial {
    public static void main(String[] args) {
        //найти факториал числа Х
        faktorialOfNumber(7);
    }

    private static void faktorialOfNumber(int x) {
        int result = 1;
        for (int i = 2; i <= x; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
