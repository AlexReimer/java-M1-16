package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
        //while: в то время как - пока
       // int a = 10;
       // int b = 50;
        evenAB(7, 56);
       // helloDoWhile(10, 50);
    }

    private static void helloDoWhile(int x, int y) {
        x = x + 50;//переписал х - новое значение
        // процедурное програмирование,
        // следующая сточка вернее чем предыдущая
        do {
            //do брат while
            System.out.println(x);
            x++;
        } while (x < y);
    }

    private static void evenAB(int a, int b) {
        while (a < b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++; //увеличь а на 1
        }
    }

}
