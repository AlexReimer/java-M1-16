package lesson05;

public class HelloBoolean {
    public static void main(String[] args) {
        booleanIntro();
        magicGame();
        magecGame2();
    }

    public static void magicGame (){
        int a = 5;
        int b = 10;
        boolean c = a > b;
        //boolean d = 10; так нельзя записывать boolean
        System.out.println(c);
        System.out.println(a <= b);
        //System.out.println(a =< b);//так записывать нельзя, вначале знак больше/меньше
        System.out.println(a >= b);
        System.out.println(true);
    }

    public static void magecGame2 (){
        boolean a = (7+8)*5 > 7+8*5;//true
        boolean b = (7+8)*4 != 7+4*5;//true
        boolean c = 3+4 > 9+1 & 16-5 > 3*4;//false
        boolean d = 16/2 < 6+2 | 4+5 <= 4*5;//true
        boolean e = !(3*4 < 7+8);//false
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n");
    }


        public static void booleanIntro (){
        boolean a = true;
        boolean b = false;
        boolean c = a && b;// И and
        System.out.println(c);
        System.out.println(a || b);//ИЛИ OR
        System.out.println(!a);//отрицание НЕ, NOT
        boolean d = !a;
        boolean f = a ^ b;//или или E-XOR, исключенное третье
        System.out.println(f);
    }
}
