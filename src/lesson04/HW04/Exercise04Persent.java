package lesson04.HW04;

public class Exercise04Persent {
    public static void main(String[] args) {
        System.out.println(countMoneyBankApplication(1000, 7));
        //здесь выаод данных для "Клинта"/"Пользователя"
    }


    public static double countMoneyBankApplication(double money, int years){
        double interest = 3.5;
        double output;
        output = money + (money / 100) * interest * years;
        return output;
        //System.out.println(output);
        //здесь вывод данных для прогмаммера,
        //например для проверки работает ли метод.
        //Потом "sout" тут может быть удален чтобы код был чище


    }
}
