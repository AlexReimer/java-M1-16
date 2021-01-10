package lesson03.homework02;

public class HomeWork03 {
    public static void main(String[] args) {
       double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise4AnotherTime(876432987, 320873408));
        System.out.println(exercise4AnotherTime(89735, 342764));
    }

    public static double exercise4AnotherTime (double firstArea, double secondArea){
        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }

    public static double exercise04() {
        //Найти соотношение площади Беларуси к площади Украины.
        // B - 207,595 km2
        // U - 603,628 km2
        double belarusArea = 207.595;
        double ukraineArea = 603.628;
        double relation = belarusArea / ukraineArea;
        System.out.println("соотношение площадей двух стран:  " + relation);
        return relation;

    }
}
