package lesson07;
// % - MOD, MODULO

public class HelloModulo {
    public static void main(String[] args) {
        int a = 7 % 4;//остаток деления в 7/4 записываем в виде числа
        int b = 7 / 4;//результат 1, так как результат - только цклое число
        System.out.println(a);
        System.out.println(b);

        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное");
        }
    }
}
