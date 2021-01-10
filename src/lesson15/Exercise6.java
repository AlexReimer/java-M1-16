package lesson15;

public class Exercise6 {
    public static void main(String[] args) {
        rectangle(5, 7);// -> прямоуголоник из символов
        combinationThree();
    }

    public static void combinationThree() {
        /* Три неизвестных. нужно написать алгоритм вывода на экран всех возможных комбинаций 3-х натуральных чисел до 36 с определенными условиями:
    1. необходимо использовать вложенные циклы
    2. x <= y <= z
    3. xyz = 36
    например: 1. x=1, y=1, z=36 2. x=1; y=3; z=12
         */
        int result = 36;
        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }

    private static void rectangle(int a, int b) {
        /*Прямоугольник из символов. При вызове метода rectangle(5, 7); на экране появился прямоугольник.
        #######
        #######
        #######
        #######
        #######
         */
        for (int i = 0; i < a; i++) {//цикл в цикле. в первом задаем сколько символом в строке будет. во втором - сколько стро нужно создать
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
