package lesson15;

public class Exercise5_12 {
    public static void main(String[] args) {
        printLineNtimes("Hello", 3);//-> hello hello hello
        System.out.println();
        printLineNtimes("Java", 5);
        System.out.println();
        System.out.println(printLineNtimesString("Frontend", 2));
        countdown(5);//-> 5 4 3 2 1 start
        System.out.println();
        System.out.println(digitPowTwo(5));//-> 25
        System.out.println(digitPowTwo(10));//-> 100
        System.out.println(digitPowTwo(4));//-> 16
    }

    public static int digitPowTwo(int number) {
        //Возведите число n во вторую степень.
        // Не используя арифмитический оператор умножения.
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number; // result += number ->можно короче записать
        }
        return result;//return обязательно - это не void
    }

    public static void countdown(int number) {
        //Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от n до 1,
        // затем выводит строку „start“.
        //countdown(5) -> 5 4 3 2 1 start
        for (int i = number; i > 0; i--) {//здесь минус-минус: мы не складываем, а отнимаем
            System.out.print(i + " ");
        }
        System.out.print("start");
    }

    public static String printLineNtimesString(String word, int number) {
        //создади метод с двумя переиенными стринг, которыц будет выволдиться
        //и int - количетво раз распечатки
       String result = "";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static void printLineNtimes(String word, int number) {
       /* Повторяка номер n
Реализовать метод, который выводит на экран заданную строку N раз.
printLineNtimes(“hello”,3) -> hello hello hello */
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(word + " ");// без новой строки, print без ln
        }

    }
}
