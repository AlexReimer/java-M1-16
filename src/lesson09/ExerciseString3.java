package lesson09;

public class ExerciseString3 {
    //Given a string of even length,
    // return the first half. So the string "WooHoo" yields "Woo".
    //взять слово, замерить его длинну, разделить на 2 и вывести 1-ю половину
    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));// → "Woo"
        System.out.println(firstHalf("HelloThere"));// → "Hello"
        System.out.println(firstHalf("abcdef"));// → "abc"
    }

    public static String firstHalf(String input) {
        int half = input.length() / 2;//длину Василия делим на 2
        return input.substring(0,half);
    }
}


