package lesson19;

public class ArrayIntro {
    public static void main(String[] args) {
        //введение в МАССИВ - однотипные переменные - книги на полке. Полка это массимв
        // обозначаются через []

//        introOne();
//        introOld();

        arrayCDeclarationAndInitialisation();
    }

    private static void arrayCDeclarationAndInitialisation() {
        int [] justExample = new int [10];//резервируем место в памяти. в данном случае 10 интов
        int [] justExampleTwo;
        justExampleTwo=new int [1000];
        int [] field = new int [] {10,5,3,7,4,9,8};
        int[] numberFibonacci = new int []{0,1,1,2,3,5,8,13,21,34,55};
        // доступ к длине массива можно с помощью переменной length
        System.out.println(numberFibonacci.length);
        // пример
        //объявление стринга здесь через: new String
        String []germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf"};
       // доступ к длине массива можно с помощью переменной length
        System.out.println(germanCities.length); // -> 5
    }


    private static void introOne() {//это новый стандарт

        int[] myArray;
        String[] user;
        double[] gpsPoints;
        boolean [] truthTable;
        char[] cyrillicAlphabet;

    }

    private static void introOld() {//квадратные скобки в конце считается устаревшим
        int myArray[];
        String user[];
        double gpsPoints[];
        boolean  truthTable[];
        char cyrillicAlphabet[];
    }
}

