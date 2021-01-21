package lesson08;

public class ExerciseFor6 {
    public static void main(String[] args) {
        alphabet();
    }

    public static void alphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("" + c+c+c+c); //четыре раза разпечатать букву
            //если в sout не вставить пустой стринг - "" -,
            // то комп будет считать c не как char и не зарпечатывать буквы AAAA, BBBB, CCCC ... ZZZZ
            // а складывать 65 (код А в чаре) и выйдет на выдаче 260, а не АААА
        }
    }
}
