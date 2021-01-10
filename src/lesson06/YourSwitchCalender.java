package lesson06;

public class YourSwitchCalender {
    public static void main(String[] args) {
        String month = "January";
        System.out.println(stringToIntMonthNumber(month));
    }

    public static int stringToIntMonthNumber(String month) {
        int monthNumber = 0;
        switch (month) {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
            case "September":
                monthNumber = 9;
                break;
            case "Oktober":
                monthNumber = 10;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1; //в инте int нельзя текс, только цифры, договорилсиь на -1,
                // потому что О зарезервирован как первое значение. Поэтому -1 как показатель того,
                // что такого значение быть не можен
                break;

        }
        return 0; //здесь 0 - дефолтное отрицательное значение, используется временно, когда метод еще не дописан

    }
}