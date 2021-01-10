package lesson17;

public class Converter {
    public static void main(String[] args) {
       // System.out.println(convertDezimalToBinaryWhile(78));
        System.out.println(convertDezimalToBinary(78));
    }

    //из десятичногоо получить двоичного
    public static String convertDezimalToBinaryWhile(int dezimal) {
        String output = "";
        while (dezimal > 0){
            int remainder = dezimal%2;//находим цифру из двоичного числа в результате
            output = remainder + output;//записываем цифру в наш оезультат и мы записывем начиная с конца
            dezimal = dezimal /2;//следующий шаг - делтм ИНПУТ на 2 и переиспользуем его
        }
        return output;
    }

    private static String convertDezimalToBinary (int decimal) {
        String output = "";
        for (int i = decimal; i > 0; i=i/2) {
            int remainder = i%2;
            output = remainder + output;
            //System.out.println(i);
        }
        return output;
    }
}
