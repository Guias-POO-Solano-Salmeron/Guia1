package guia1;
import javax.swing.JOptionPane;
//Nombres
//Apellidos
//Edad
//Carrera
public class Complementario_2 {
    public static void main(String[] args){
        String primerNombre;
        String segundoNombre;
        String primerApellido;
        String segundoApellido;

        String edad;
        int edadInteger;
        String carrera;

        primerNombre = JOptionPane.showInputDialog("Escriba su primer nombre:");
        segundoNombre = JOptionPane.showInputDialog("Escriba su segundo nombre:");

        primerApellido = JOptionPane.showInputDialog("Escriba su primer apellido:");
        segundoApellido = JOptionPane.showInputDialog("Escriba su segundo apellido:");

        edad = JOptionPane.showInputDialog("Digite su edad:");

        edadInteger = Integer.parseInt(edad);

        System.out.println("Primer Nombre: " + primerNombre);
        System.out.println("Segundo Nombre: " + segundoNombre);
        System.out.println("Primer Apellido: " + primerApellido);
        System.out.println("Segundo Apellido: " + segundoApellido);
    }
}
