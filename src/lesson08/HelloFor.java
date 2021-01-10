package lesson08;

public class HelloFor {
    public static void main(String[] args) {
       myWeek();
    }

    public static void myWeek (){
        int weekDays =7;
        //for или fori
        //начало
        //условие
        //шаг
        // что ниже? почему внизу
        for (int i = 0; i < weekDays; i++) {
            // тело цикла - начни с 0 и прибавляй единицу (i++)
            // к каждому следующему результату i++
            System.out.println("------");
            System.out.println("встаю утром");
            System.out.println("завтракаю");
            System.out.println("иду на работу");
            System.out.println("прихожу с работу");
            System.out.println("курю с соседом");
            System.out.println("ужинаю");
            System.out.println("смотрю нетфликс");
            System.out.println("иду спать");
            System.out.println(i);//это i которое наверху в скобках

        }
    }
}
