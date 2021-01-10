package exercises;

public class Exercise1 {
    public static void main(String[] args) {
        //Родители Васи Сидорова купили умный сейф и запрограммировали его
        // на выдачу денег по отпечатку пальцев одного из родителей.
        System.out.println(smartDepositBox(true, false)); // -> true
        System.out.println(smartDepositBox(false, true)); // -> true
        System.out.println(smartDepositBox(false, false)); //-> false
        //После покупки сейфа в семье начался разлад по поводу
        // выделению сыну денег и родители решили сейф перепрограммировать,
        // таким образом, что бы он выдавал деньги только при обоюдном согласии родителей.
        System.out.println(smartDepositBoxVersionTwo (true, false));
        System.out.println(smartDepositBoxVersionTwo (false, true));
        System.out.println(smartDepositBoxVersionTwo (false, false));
        System.out.println(smartDepositBoxVersionTwo (true, true));
        // К родителям Васи Сидорова приехала Бабушка и сказала,
        // что родители не умеют воспитывать сына и она сама знает,
        // когда давать ребёнку деньги. Напишите программу выдачи денег Васе,
        // если бабушка выдаёт деньги независимо от решения родителей.
        System.out.println(verySmartDepositBoxVersionThree (false, true, true));
        System.out.println(verySmartDepositBoxVersionThree (false, false, false));
        System.out.println(verySmartDepositBoxVersionThree (true, false, false));
        System.out.println(verySmartDepositBoxVersionThree (true, true, true));
        System.out.println(verySmartDepositBoxVersionThree (true, true, false));
        System.out.println("verySmartDepositBoxVersionThree");

        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission = true;
        papaPermission = false;
        omaPermission = false;
        System.out.println(verySmartDepositBoxVersionThree (mamaPermission, papaPermission, omaPermission));

    }

    public static boolean verySmartDepositBoxVersionThree1
            (boolean mama, boolean papa, boolean oma){
        return smartDepositBoxVersionTwo(mama, papa) || oma;

    }

    public static boolean verySmartDepositBoxVersionThree (boolean mama, boolean papa, boolean oma){
        return (mama && papa) || oma;

    }

    public static boolean smartDepositBoxVersionTwo (boolean mama, boolean papa) {
        return mama && papa;

    }
    public static boolean smartDepositBox (boolean mama, boolean papa) {
        boolean result = mama || papa;
        return result;

    }
}
