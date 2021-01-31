package myExercise;

public class ForLoopCubeOfNumber {
    public static void main(String[] args) {
        cubeOfNumber(5, 8);

    }

    private static void cubeOfNumber(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++ ) {
            result = i * i * i;
            System.out.println(result);
        }
    }
}
