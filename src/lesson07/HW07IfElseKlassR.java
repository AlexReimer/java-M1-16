package lesson07;

public class HW07IfElseKlassR {
    public static void main(String[] args) {
        int speed = 140;
        speedControl(speed);
    }

    private static void speedControl(int speed) {
        if (speed <= 50) {
            System.out.println("нарушений нет");
        } else if (speed <= 65) {
            //(speed > 50 && speed <= 65) первая часть лишняя,
            // т.к. уже в первом иф уже это отсечено
            System.out.println("предупреждение");
        }else if (speed <100) {
            System.out.println("штраф 40евро");
        }else if (speed <130) {
            System.out.println("штраф 500евро");
        }else {
            System.out.println("Выписываю штраф - 1000 €; лишаю прав на 3 года и конфискую ТС");
        }
    }
}
