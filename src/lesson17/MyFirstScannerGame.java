package lesson17;

import java.util.Scanner;//импортируем введя внизу сканер потом правой книпокой контекст меняю

public class MyFirstScannerGame {
    /*Президент приходит к власти если набрал 51% голосов избирателей.
    Создайте машину для ввода результатов выборов.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//запомнить эту Scanner(System.in)
        int quantity;
        System.out.println("Print quntity of voices");
        quantity=input.nextInt();//!!!запомнить этот метод input.nextInt
        if (quantity>50) {
            System.out.println("Your are president \n Congrats");
        } else {
            System.out.println("You are looser");
        }
    }

}
