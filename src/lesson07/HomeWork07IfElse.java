package lesson07;

public class HomeWork07IfElse {
    public static void main(String[] args) {
        speedingFinePolice(65);
        knightByStone(3);
    }


    /*
Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
при езде до 50 км/час нарушений нет;
за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
за превышение скорости от 16 км/час — 40 евро штрафа;
за езду от 100 км/час до 130 км/час — штраф 500 евро;
и за езду свыше 130 км/час — штраф в 1000 евро,
конфискация прав на 3 года и конфискация транспортного средства.
 */
    public static String speedingFinePolice(int speed) {
        String policeMessage = "";
        if (speed <= 50) {
            policeMessage = "Счастливой дороги!";
        } else if (speed > 50 && speed <= 65) {
            policeMessage = "Вы превысили скорость. Ставлю на вид";
        } else if (speed > 65 && speed <= 100) {
            policeMessage = "Выписываю штраф - 40 €";
        } else if (speed > 100 && speed <= 130) {
            policeMessage = "Выписываю штраф - 500 €";
        } else if (speed > 130 && speed <= 500) {
            policeMessage = "Выписываю штраф - 1000 €; лишаю прав на 3 года и конфискую ТС";
        }
        return policeMessage;
        //System.out.println(policeMessage);
    }



    //Напишите программу, которая объяснит наступление определённых событий,
    // в зависимости от выбора “витязя”.

    public static void knightByStone(int turn) {
        String stoneMassage = "";
        int turnLeft = 0;
        int turnRight =0 ;
        int straight = 0;
        if (turnLeft == 1) {
            stoneMassage = "Коня потеряешь";
        } else if (turnRight == 2) {
            stoneMassage = "Згинешь безвестно";
        } else if (straight == 3) {
            stoneMassage = "Коль выживешь, найдешь жОну и богатство";
        } else {
        }
        System.out.println(stoneMassage);
    }


}
