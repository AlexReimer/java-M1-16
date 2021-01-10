package lesson16;

public class MakeBricksLoops {
    public static void main(String[] args) {
         /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5
    inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it
    looks and can be done without any loops.
    See also: Introduction to MakeBricks
    ------
    1.Есть кирпичи: а) small - 1 дюйм; б)big 5 дюймов
    2.Сделать кирпичный ряд
    3.Верни true,если цель (8; 9; 10) достижима
    4.это boolean т.к. в задаче условия true ^ false
     */
        System.out.println(makeBricksSecond(3, 1, 8));// →true
        System.out.println(makeBricksSecond(3, 1, 9));// →false
        System.out.println(makeBricksSecond(3, 2, 10));// →true
        System.out.println(makeBricks(3, 2, 9));// → false

    }

    private static boolean makeBricksSecond(int small, int big, int goal) {
        // недостаточно для цели
        if (goal>big*5+small) return false;

        //недостаточно small
        if (goal % 5 > small) return false;
        return true;
    }

    private static boolean makeBricks(int smalBox, int bigBox, int goal) {
        return smalBox + bigBox * 5 == goal || smalBox == goal || bigBox * 5 == goal;
    }

}
