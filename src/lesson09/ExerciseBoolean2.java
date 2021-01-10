package lesson09;

public class ExerciseBoolean2 {
    public static void main(String[] args) {
        /*You are driving a little too fast, and a police officer stops you.
        Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        If speed is 60 or less, the result is 0.
        If speed is between 61 and 80 inclusive, the result is 1.
        If speed is 81 or more, the result is 2.
        Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
         */
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
        System.out.println(caughtSpeeding(81, false));// → 2
        System.out.println(caughtSpeeding(81, true));// → 1
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (true) {
            speed = speed - 5;
        }
        int output;
        if (speed <= 60) {
            output = 0;
        } else if (speed <= 80) {
            output = 1;
        } else {
            output = 2;
        }
        return output;
    }
}