package myExercise;
//switch без break, к чему приводит
// Джава - полное руководство для начинающих: оператор break может отсутвовать,
// но в реальных приложениях, как правило, применяется

public class SwitchNoBreak {
    public static void main(String[] args) {
        int a;
        //int х был, но выдавало ошибку и пришлось сменить на а
        //результат вывода данных как и в книге

        for (int i = 0; i <= 5 ; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше единицы");
                    case 2:
                    System.out.println("i меньше двух");
                    case 3:
                    System.out.println("i меньше трех");
                    case 4:
                    System.out.println("i меньше четырех");

            }
            System.out.println();
        }
    }
}
