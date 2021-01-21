package lesson09;

public class Fibonacci {
    public static void main(String[] args) {
       lineFibonacci(11);
     // lineFibonacci(70);
    }

    public static void lineFibonacci(int number) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i < number; i++) {
             int nNext = n1 + n2;
            System.out.print(nNext + " ");
            n1=n2;
            n2=nNext;
        }
    }
}
