package lesson14;

public class HW13_4 {
    public static void main(String[] args) {
        double finalPrice = countCost(8, 4, 180, 175);
        System.out.println("Итого " + finalPrice);
    }

    private static double countCost(int doors,
                                    int windows,
                                    double high,
                                    double wide) {

        return doorsPrice(doors) + windowsPrice(windows, high, wide);
    }

    private static double windowsPrice(int windows,
                                       double high,
                                       double wide) {
        double meterHigh = high / 100;
        double meterWide = wide / 100;
        double framePrice = 100;
        double glassPrice = 100;
        double perimeter = (meterWide + meterHigh) * 2;
        double area = meterWide * meterHigh;
        return (perimeter * framePrice + area * glassPrice) * windows;
    }


    private static double doorsPrice(int doors) {
        double doorsMeterPrice = 120.0;
        double framePrice = 100.0;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;

        return (perimeter * framePrice + area * doorsMeterPrice) * doors;
    }

}



/*
Окна и двери
В старых советских хрущёвках города № решили поменять деревянные окна и двери на пластиковые. Выяснилось, что все двери в хрущёвках одинакового размера 2м*90см, а окна разные, но в каждой квартире могут быть только одинаковые окна.
Стоимость переделки окон рассчитывается из стоимости стекла - 100€ за квадратный метр и стоимости косяка - погонный метр 100€.
Стоимость дверей рассчитывается исходя из стоимости косяка (как и у окна) и стоимости самой двери 120€ за квадратный метр.
Напишите программу, которая поможет стройтресту №12 правильно выставлять счета.
 */