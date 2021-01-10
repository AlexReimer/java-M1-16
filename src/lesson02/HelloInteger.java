package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
       helloInt();
       helloLong();
    }

        public static void helloLong() {
            System.out.println("А здесь мы рассмотрим - long");
            long al = 12097;
            int test = 12097;
            long bl = 9_083_899_873_987L;// если число не "помещается", то добавляем L
            long cl = 8_056_899_873_967L;// нижнее подчеркивание - для читаемости кода (джава не видит это)
            long sum = al + bl;

        }

         public static void helloInt() {
        int a = 5;
        int b = 3;
        //int leftButtonUserLogin leftbuttonuserlogin (ошибка - написание слов не с большой буквы)
        int c = a + b;
        //definition
        //!!! declaration !!!
        //initialisation (спрашиваеют на собеседовнии
        int x;  //!!! declaration !!! объявление переменной

             System.out.println("Это мое c" + c);
    }

}
