package lesson28;

public class ExerciseInKlass {
    public static void main(String[] args) {
        // даны 2 инта. вернуть простые натуральные числа в их диапазоне

        naturalNumbers(1, 10);
        naturalNumbers(5, 45);
    }

    private static void naturalNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            // if (i % i == 0)
            if (primeNumber(i)) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    private static boolean primeNumber(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        int count = 0; //вариант 1
        // boolean flag = false; //вариант 2
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                //  flag = true; //вариант 2
            }
        }
        if (count > 0) {
            return false;
        }
        //вариант 2
        //   if (flag) {
        //      return false;
        //   }
        return true;
    }
}

