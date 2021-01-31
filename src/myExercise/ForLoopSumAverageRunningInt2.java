package myExercise;

public class ForLoopSumAverageRunningInt2 {
    public static void main(String[] args) {
        int count = 0;
        int lowerbound = 111;
        int upperbound = 8899;
        double average;

        for (int i = lowerbound; i <= upperbound; i++) {
            count += i;
            ++count;
        }
        average = count / 100;
        System.out.println(count);
        System.out.println(average);
    }
}
