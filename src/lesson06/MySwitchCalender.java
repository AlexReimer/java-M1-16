package lesson06;

public class MySwitchCalender {
    public static void main(String[] args) {
        int myUnknownMonth = 12;
        System.out.println(intToStringMonthName(15));
        System.out.println(intToStringMonthName(13));

    }

    public static String intToStringMonthName(int number) {
        String output = "";
        String result = "";
        String monthName = "";

        switch (number) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                System.out.println("проверка декабря");
                System.out.println("Самый прекрасный месяц в году");
                break;
            default:
                monthName = "Doesn't exist";
                break;

        }
        return monthName;
    }
}
