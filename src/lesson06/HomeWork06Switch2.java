package lesson06;
/*Напишите программу, которая определяет сезон года.
Месяца указаны int переменными.
 */

public class HomeWork06Switch2 {
    public static void main(String[] args) {
        int month = 11;
        System.out.println(findSeason(month));
        //scope - > область видимости
    }

    public static String findSeason(int monthNumber) {
        String season = "";//инициализируем сезон пустой строкой
        switch (monthNumber) {

            case 11:
            case 10:
            case 9:
                season = "Осень";
                break;//брейк - выход из ближайшей стобки
            //если повторы есть (Осень - три раза), убираем break повторов
            // оставляем один раз, чтобы не было избыточного кода - РЕДУДАНТНОГО кода
            case 8:
            case 7:
            case 6:
                season = "Лето";
                break;
            case 5:
            case 4:
            case 3:
                season = "Весна";
                break;
            case 2:
            case 1:
            case 12:
                season = "Зима";
                break;
            default: //дефаулт - это ЗАЩИТА ОТ ДУРАКА - если пришли не те данные
                season = "нет такого сесона";
                break;
        }
        return season;
    }
}