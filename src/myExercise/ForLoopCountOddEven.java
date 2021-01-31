package myExercise;

public class ForLoopCountOddEven {
    public static void main(String[] args) {
        countOddEven (159);

    }

    private static void countOddEven(int num) {
        //Написать программу, подсчитывающую количество четных и нечетных цифр в числе 159
        int countEven = 0;
        int countOdd = 0;
        for (int i = 1; i <=num; i++) {
            if (i%2 !=0) {
                countOdd ++;
            }else {
                countEven ++;
            }
        }
        System.out.println(countOdd);
        System.out.println(countEven);

    }


}
