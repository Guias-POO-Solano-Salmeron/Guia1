package guia1;
import javax.swing.JOptionPane;

// Nombres
// Apellidos
// Edad
// Carrera

public class Complementario_3 {
    public static void main (String[] args) {
        //Declaración de variables
        String primerNombre;
        String segundoNombre;
        String primerApellido;
        String segundoApellido;

        String edadInput;
        int edadInteger;

        String carrera;

        //Lógica del programa
        primerNombre = JOptionPane.showInputDialog("Ingrese su primer nombre");
        segundoNombre = JOptionPane.showInputDialog("Ingrese su segundo nombre");
        primerApellido = JOptionPane.showInputDialog("Ingrese su primer apellido");
        segundoApellido = JOptionPane.showInputDialog("Ingrese su segundo Apellido");
        edadInput = JOptionPane.showInputDialog("Ingrese su edad");
        carrera = JOptionPane.showInputDialog("Ingrese la carrera que está cursando");

        edadInteger = Integer.parseInt(edadInput);

        JOptionPane.showMessageDialog(null,
                "Primer nombre: " + primerNombre +
                        "\nSegundo Nombre: " + segundoNombre +
                        "\nPrimer Apellido: " + primerApellido +
                        "\nSegundo Apellido: " + segundoApellido +
                        "\nEdad: " + edadInteger +
                        "\nCarrera: " + carrera ,
                    "Resultado",
                        JOptionPane.PLAIN_MESSAGE);
    }
}
