package lesson09;

public class ExerciseString {
    public static void main(String[] args) {
        //Given a string name, e.g.
        // "Bob", return a greeting of the form "Hello Bob!".
        System.out.println(helloName("Bob"));//→ "Hello Bob!"
        System.out.println(helloName("Alice"));//→ "Hello Alice!"
        System.out.println(helloName("X"));// → "Hello X!"
        System.out.println(helloName("Tel-Ran"));// → "Hello Tel-Ran!"
    }

    private static String helloName(String name) {
        String result = "Hello " + name + '!';//здесь char '' так указан, чтобы !
   return result;
    }
}


