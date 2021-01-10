package myExercise;

import javax.swing.*;

public class swing {
    public static void main(String ... args) {
        //Ausgabe im Konsonfenster:
        System.out.print("Dies ist eine ");
        System.out.println("Ausgabe mit " + (4+3) + " Wörtern.");

        //Ausgabe in eigenem Fenster:
        JOptionPane.showMessageDialog(
                null, "Die ist eine Ausgabe \nmit " + 7 + " Wörtern."
        );
    }
}
