package lesson16;

public class MyPassword {
    public static void main(String[] args) {
        //создать 20 паролей
        /* как? шаги:
        1.Надо сделать символ
        2.Надо сделать пароль
        3.Повторить операцию 20 раз
         */
        System.out.println(giveMeChar(97, 122));
        System.out.println(giveMeChar('a', 'z'));
        System.out.println(giveMePass(20));
        nTimePassGenerate(20);
    }

    public static void nTimePassGenerate(int times) {
        // 3.Повторить операцию 20 раз
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(10));
        }
    }

    private static String giveMePass(int size) {
        // 2.Надо сделать пароль
        String result = "";
        for (int i = 0; i < size; i++) {
            result += giveMeChar (97,122); // result = result + giveMeChar (97,122);
        }
        return result;
    }

    public static String  giveMeChar (int min, int max){
        //1.Надо сделать символ
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        //return = String.valueOf(myChar);
        result = "" + myChar;
        return result;
    }

}
