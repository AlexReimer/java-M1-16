package lesson04;

public class HomeWork04 {
    public static void main(String[] args) {
        professoinName();
        personalData();

        char smile = '\u263a';
        System.out.println(smile);
        char smile_big = '\u1F00';
        System.out.println(smile_big);
        char phone = '\u260e';
        System.out.println(phone);
        char phone2 = '\u2706';
        System.out.println(phone2);
        char paragraph = '\u00a7';
        System.out.println(paragraph);
        char copyright = '\u00a9';
        System.out.println(copyright);
        char trademark = '\u2122';
        System.out.println(trademark);
        char rubel = '\u20bd';
        System.out.println(rubel);
        char euro = '\u20ac';
        System.out.println(euro);
        char dollar = '\u0024';
        System.out.println(dollar);
        char aries = '\u2648';
        System.out.println(aries);
        char heartcard = '\u2661';
        System.out.println(heartcard);
        char chessking = '\u2654';
        System.out.println(chessking);
    }

    private static void personalData() {
        String firstName2 = "User firstname: Alexander";
        String secondName = "User secondname: Reimer";
        String adress = "Glockenturmstr. 36, 14055 Berlin";
        System.out.println(firstName2);
        System.out.println(secondName);
        System.out.println(adress);
    }

    public static void professoinName() {
        String firstnName = "Alexander";
        String profession = "Software-Developer";
        String massage = "wanna be a ";
        String welcomeMessege = firstnName + " " + massage + '\u0022' + profession + '\u0022' + " " + '\u263a';
        String profession2 = "\"Software - Developer";

        System.out.println(welcomeMessege);
        System.out.println(profession2);
    }


}

