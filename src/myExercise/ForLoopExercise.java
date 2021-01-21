package myExercise;

public class ForLoopExercise {
    public static void main(String[] args) {
        SumNaturalTenNumbers();
        //  PrintOneToTen();

    }


    private static void SumNaturalTenNumbers() {
        int sum = 0;
        for (int i = 0; i <= 10; ++i) {
            sum = sum + i;
           // sum += i; то же самое
        }
        System.out.println("Sum: " + sum);
    }

    public static void PrintOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
