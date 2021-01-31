package myExercise;

public class ForLoopFibonachi {
    public static void main(String[] args) {
        fibonachiNumber(0, 1000);
    }

    private static void fibonachiNumber(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = i + sum;
            System.out.println(sum);
        }
    }
}
