package lesson25.HomeWork25;

public class HW25WhileDoWhile {
    public static void main(String[] args) {
        /*Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.*/
        int a = 5;
        do {
            System.out.println(a);
            a++;
        } while (a <= 17);

        System.out.println("_________");

        /*Даны целые числа A и B, где B > 0. Вывести B раз число A.*/
        printNumberA(15, 5);

    }

    private static void printNumberA(int a, int b) {
        int count = 0;
        while (count <= 4) {
            System.out.println(a);
            count++;
        }
    }
}