package myExercise;

public class IfElseIf {
    public static void main(String[] args) {
        int y;

        for (int x=0; x<6; x++) {
            if (x==1)
                System.out.println("x равно единице");
            else if(x==2)
                System.out.println("x равно двум");
            else if(x==3)
                System.out.println("x равно трем");
            else if(x==4)
                System.out.println("x равно четырем");
            else
                //условие, выполняемое по умолчению
                System.out.println("Значение x находиться вне диапазона 1-4");
        }
    }
}
