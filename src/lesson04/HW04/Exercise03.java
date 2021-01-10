package lesson04.HW04;

public class Exercise03 {
    public static void main(String[] args) {
        //написать формулу вычисления стоимости евро,
        //если курс евр к доллеру 1,1.
        System.out.println("при переденных "
                + 1000
                + "Долларов" + "клиент получит"
                + currencyConverter (1000));
    }


    public static double currencyConverter(double dollars){
        double rate = 1.1;
        double euro = dollars / rate;
        return euro;

    }

}
