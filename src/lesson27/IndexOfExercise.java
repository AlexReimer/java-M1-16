package lesson27;

public class IndexOfExercise {
    public static void main(String[] args) {
        String hm="Василий";
       // int magisNumber = hm.indexOf("c");//вернет индекс появления "с"
       // int magisNumber = hm.indexOf("Я");//вернет -1, что значит "не найдено"
        int magisNumber = hm.indexOf("c", 4);//вернет -1, что значит "не найдено"

       // System.out.println(magisNumber);
        String prefix = "abc";
        String word = "abcxyabc";
        System.out.println(word.indexOf(prefix,1));
    }
}
