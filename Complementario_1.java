package guia1;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Complementario_1 {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        int numero1 = 0;
        int numero2 = 0;
        int suma;
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        while (!isNumber(primernumero)) {
            primernumero = JOptionPane.showInputDialog(null,
                    "Valor incorrecto, Por favor inserta un número");
        }
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        while (!isNumber(segundonumero)) {
            segundonumero = JOptionPane.showInputDialog(null,
                    "Valor incorrecto, Por favor inserta un número");
        }
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        if (numero1 < 0){
            JOptionPane.showMessageDialog(null, "No puedes ingresar números negativos","Error", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }else if (numero2 < 0){
            JOptionPane.showMessageDialog(null, "No puedes ingresar números negativos","Error", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        else{
            suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es:" + suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        };

    }

    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
