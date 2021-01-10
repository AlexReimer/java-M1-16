package lesson08;

public abstract class ExerciseFor5 {
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    // myLine(100) ->
    //      7 14 21 28 35 42 49 56 63 70 77 84 91 98
    public static void main(String[] args) {
        myLine(100);
    }

    private static void myLine(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

        }
    }


}
