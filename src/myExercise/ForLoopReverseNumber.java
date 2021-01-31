package myExercise;

public class ForLoopReverseNumber {
    public static void main(String[] args) {
        /*Вводится двузначное число. Преобразовать его в другое число,
        цифры которого будут следовать в обратном порядке по сравнению с введенным числом.
        Двумя методами: математическим и через строку
         */
        reverseNumberWhile(56);
        reverseNumberFor(521);
        reverseNumberString(2364);

    }

    private static void reverseNumberString(int y) {
        int temp = y;
        String str = Integer.toString(temp);
        String reverse = "";
        for (int i = 0; i < str.length() -1 ; i++) {
            reverse = str.charAt(i) + reverse; //расписать на листочке чтобы понять

        }
        //второй вариант записи с таким же результатом, что и выше ^
//        for (int i = str.length() -1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
        System.out.println(reverse);
    }

    private static void reverseNumberFor(int x) {
        int reverse = 0;

        for (; x !=0; x=x/10) {
            int temp = x % 10;
            reverse = reverse * 10 + temp;
        }
        System.out.println(reverse);
    }

    private static void reverseNumberWhile(int n) {
        int reverse = 0;

        while (n > 0) {
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n/10;
        }
        System.out.println("Reverse of number: " + reverse);
    }


}

