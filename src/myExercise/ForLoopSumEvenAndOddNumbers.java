package myExercise;

public class ForLoopSumEvenAndOddNumbers {
    public static void main(String[] args) {
        System.out.println(sumEvenAndOdd(1, 10));


//        int lowerbound = 1;
//        int upperbound = 10;
//        int sumEven = 0;
//        int sumOdd = 0;

    }

    private static int sumEvenAndOdd(int a, int b) {
        int sumEven = 0;
        int sumOdd =0;
        for (int i = 0; i <= b; i++) {
            if (i % 2 == 0) {
                sumEven += i;
              //  System.out.println(sumEven);
            } else {
                sumOdd += i;
            //    System.out.println(sumOdd);
            }
        }
        return sumOdd;
    }
}
