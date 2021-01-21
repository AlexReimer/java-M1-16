package lesson30;

public class MainForDuck {
    public static void main(String[] args) {
        Duck greyDuck = new Duck();//это не переменная, а созданный нами НОвый тип данных (с большой буквы
        greyDuck.age = 4;
        greyDuck.bred = "anasPlatyrhynchonos";
        greyDuck.color = "grey";
        greyDuck.flies();
        greyDuck.eats();
        System.out.println(greyDuck.age);
        System.out.println(greyDuck.color);
    }
}
