package lesson06;

public class HelloSwitch {
    /* за пятерку по контрольной Java - велосипед
       за четверку - goPro новая
       за тройку - хотя бы не отругают
       за двойку отругают
       за единицу - "Лучше и не спрашивай"
       SWITCH метод например в Лифте (нажал 3, поехал на
        */
    public static void main(String[] args) {
        int оценкаВЧетверти = 1;
        int score = 3;
        myFirstSwitch(оценкаВЧетверти);
        myFirstSwitch(score);
        myFirstSwitch(5);
        myFirstSwitch(4);
        myFirstSwitch(2);
    }

    public static void myFirstSwitch (int schoolScore){
        String prize = "";//награда получаемая
        //switch - оператор выбора, ключевое слово,
        switch (schoolScore){
            case 1:
                prize = "Лучше и не спрашивай";
                break;
            case 2:
                prize = "За двойку отругают";
                break;
            case 3:
                prize= "Хотя бы не поругаеют";
            break;
            case 4:
                prize= "goPro новая";
                break;
            case 5:
                prize= "велосипед";
                break;
            default:
                prize= "Такой оценки не существует"; //default - на случай, что придет значение,
                // которое мы не учитывали
                break;
        }
        System.out.println(prize);

    }
}
