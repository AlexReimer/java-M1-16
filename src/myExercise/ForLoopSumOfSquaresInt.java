package myExercise;

public class ForLoopSumOfSquaresInt {
    public static void main(String[] args) {
        /*program to find the "sum of the squares"
        of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
         */
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int temp = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            temp = i * i;
            sum = sum + temp;
            //    sum = sum + i * i;
        }
        System.out.println(sum);


//        for (int i = 0; i <= upperbound; i++) {
//
//            for (int j = 0; j < i * i; j++) {
//                count = count + i;
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
