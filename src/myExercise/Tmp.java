package myExercise;

public class Tmp {
    public static void main(String[] args) {
        ReverseNumberFor(3478);
    }

    private static void ReverseNumberFor(int n) {

        int num = n;
        int reversed = 0;
        for (; num > 0; ) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println(reversed);
    }

}
