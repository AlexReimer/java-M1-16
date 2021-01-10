package lesson09;
//When squirrels get together for a party, they like to have cigars.
// A squirrel party is successful when the number of cigars
// is between 40 and 60, inclusive.
// Unless it is the weekend, in which case there is no upper bound on the number of cigars.
// Return true if the party with the given values is successful, or false otherwise.

public class ExerciseBoolean {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false));// → true
        System.out.println(cigarParty(70, true));// → true
        System.out.println(cigarParty(70, false));// → false
    }

    private static boolean cigarParty(int cigars, boolean weekend) {
        return (cigars>40 && cigars < 60 && !weekend)||(cigars > 60 && weekend);
    }


    private static boolean cigarParty2(int cigars, boolean weekend) {
        if (cigars>40 && cigars < 60 && !weekend) {
            return true;
        }else if (cigars > 60 && weekend) {
            return true;
        }else{
            return false;
        }
    }

    private static boolean cigarParty1(int cigars, boolean weekend) {
        if (cigars < 40) {
            return false;
        } else if (cigars <= 60 && !weekend) {
            return true;
        } else return cigars > 60 && weekend;
    }
}
