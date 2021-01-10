package lesson20;

public class HomeWork20_Silvester {
    public static void main(String[] args) {

        printSumInRub(1, 8);//рублей
        printSumInRub(0, 1);//рубль
        printSumInRub(1, 2);//рубля
        printSumInRub(19, 2);//рубль
        printSumInRub(25, 6);//рубль
        printSumInRub(30, 5);//рублей
        printSumInRub(41, 2);//рубля
        printSumInRub(10, 1);//рублей -> ошибка - выводит "рубль" из-за последней 1

    }

    private static void printSumInRub(int a, int b) {
        int sum = a + b;
        int newsum = sum % 10;
        if (newsum == 1)
            System.out.println("рубль");
        if (newsum == 2 || newsum == 3 || newsum == 4)
            System.out.println("рубля");
        if (newsum == 0 || newsum == 5 || newsum == 6 || newsum == 7 || newsum == 8 || newsum == 9)
            System.out.println("рублей");

        }
    }




