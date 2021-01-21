package lesson08;

public class Arifmethika {
    public static void main(String[] args) {
        //синтаксический сахар - сокращение, позволяющее писать код короче
        //  myIncremantation ();
        //  myDecrimantation();
    }


        public static void myIncremantation () {
            int a = 5;
            a = a + 1;
            System.out.println(a);
            a++; // a = a + 1 запись идентична a++
            System.out.println(a);
            a += 1;
            System.out.println(a);
            ++a; //пока не пользоваться
        }
    }

