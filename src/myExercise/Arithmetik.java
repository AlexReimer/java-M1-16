package myExercise;

import javax.swing.*;

/**
 * Führt verschiedene arithmetische Operationen durch
 */

public class Arithmetik {
    public static void main(String[] args) {
        int m, n, k; //ganze Zahlen
        double x, y, z; //'reele' Zahlen
        String result = "";
        //diverse arithmetische Operationen:
        k = -2 + 6 * 4;
        x = 14 / 4;
        y = 14 / 4.0;
        z = (double) 14 / 4;
        n = 14 / 4;
        m = 14 % 4;
        // Ausgabestring bestimmen:
        result = "k = " + k;
        result = result + "\nx = " + x + ", y = " + y + ", z = " + z;
        result = result + "\nn = " + n + ", m = " + m;
        JOptionPane.showMessageDialog(
                null, result, "Ergebnis", JOptionPane.PLAIN_MESSAGE
        );
    }
}
