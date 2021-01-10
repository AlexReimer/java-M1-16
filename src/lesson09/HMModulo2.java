package lesson09;

public class HMModulo2 {
    //Given a non-negative number “num”,
    // return true if num is within 2 of a multiple of 10.
    // nearTen(12) → true
    //nearTen(17) → false
    //nearTen(19) → true

    public static void main(String[] args) {
        System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
    }

    private static boolean nearTen(int num) {
        int temp = num % 10;
        return temp <=2 || temp >=8;
    }
}

