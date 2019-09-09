package notepad;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public class Estilo {

    /*Con JComboBox*/
    public static int leeTamaño1(JComboBox cbTamaño) {
        return Integer.parseInt(cbTamaño.getSelectedItem().toString());
    }

    public static String leeFuente1(JComboBox cbFuente) {
        return cbFuente.getSelectedItem().toString();
    }

    public static int leeEstilo1(JComboBox cbEstilo) {
        int estilo = cbEstilo.getSelectedIndex();
        switch (estilo) {
            case 1:
                return Font.PLAIN;
            case 2:
                return Font.BOLD;
            case 3:
                return Font.ITALIC;
            case 4:
                return Font.BOLD + Font.ITALIC;
            default:
                return 0;
        }
    }

    /*Con JList y JTextField*/
    public static int leeTamaño2(JTextField txtTamaño) {
        return Integer.parseInt(txtTamaño.getText());
    }

    public static String leeFuente2(JTextField txtFuente) {
        String fuentes = null;
        try {
            fuentes = txtFuente.getText();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return fuentes;
    }

    public static int leeEstilo2(JList lsEstilo) {
        int estilo = lsEstilo.getSelectedIndex();
        switch (estilo) {
            case 1:
                return Font.PLAIN;
            case 2:
                return Font.BOLD;
            case 3:
                return Font.ITALIC;
            case 4:
                return Font.BOLD + Font.ITALIC;
            default:
                return 0;
        }
    }
}
