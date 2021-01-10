package lesson12;

public class MyLovelyString {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
    }

    //replace - метод
    private static void exampleThree() {
        String hm = "Schwarzneger";
        String newHm = hm.replace('e', 'Я');
        System.out.println(newHm);
    }

    //codePointAt - метод
    static void exampleTwo() {
        String hm = "Schwarzneger";
        int index = 4;
        System.out.println(hm.codePointAt(4));// 97 как результат из Таблицы char
        String euroSymbol = "€";
        System.out.println(euroSymbol.codePointAt(0));
        /*codePointAt позволяет найти уни-код любого char-символа
        // а потом код можно использовать для своих задач
        //удобно, если работаешь с "иероглифим" например, его нет на клавиатуре,
        а он тебе нужен. С ин.языками тайский, грузинский...

         */
        char euroSym = 8364;
        System.out.println(euroSym);
    }

    //можно иногда не указывать public or private
    //charAt
    static void exampleOne() {
        //charAt
        String hm = "Schwarzneger";
        System.out.println(hm.charAt(3));
        System.out.println(hm.charAt(hm.length() - 3)); //третья с конца - от длины отнять 3
        char firstLetter = hm.charAt(3);
        char lastLetter = hm.charAt(hm.length() - 1);
        //System.out.println();
        System.out.println("" + firstLetter + lastLetter);
        int magicInt = firstLetter + lastLetter;
        String magicString = "" + firstLetter + lastLetter;
        String magicString2 = String.valueOf(firstLetter + lastLetter);
        String magicString3 = "";
        magicString3 += firstLetter + lastLetter;
        System.out.println(magicString);
        System.out.println(magicString2);
        System.out.println(magicString3);
        int test = 5 + 4 * 7 / 10;
        System.out.println(test);

        String nomerDoma = "№15";
        String nomerDoma1 = "15";
        System.out.println(nomerDoma);
        System.out.println(nomerDoma1);
    }
}
