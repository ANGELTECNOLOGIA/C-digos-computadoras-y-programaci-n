import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Declaramos las variables que vamos a utilizar
        int numero; 

        // Pedimos al usuario que introduzca un número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        // Descomponemos el número correspondiete

        // Sacamos el primer digito
        int primer_digito = numero / 10000;
        float resto_primer_digito = numero % 10000;

        // Sacamos el segundo digito
        int segundo_digito = (int) resto_primer_digito / 1000;
        float resto_segundo_digito = resto_primer_digito % 1000;

        // Sacamos el tercer digito
        int tercer_digito = (int) resto_segundo_digito / 100;
        float resto_tercer_digito = resto_segundo_digito % 100;

        // Sacamos el cuarto digito
        int cuarto_digito = (int) resto_tercer_digito / 10;
        float resto_cuarto_digito = resto_tercer_digito % 10;

        // Sacamos el quinto digito
        int quinto_digito = (int) resto_cuarto_digito;


        // Pedimos la salida en pantalla
        JOptionPane.showMessageDialog(null, "El dígito en pantalla es: " + numero + "\n" + "El primer dígito es: " + primer_digito + "\n" + "El segundo dígito es: " + segundo_digito + "\n" + "El tercer dígito es: " + tercer_digito + "\n" + "El cuarto dígito es: " + cuarto_digito + "\n" + "El quinto dígito es: " + quinto_digito + "\n");

    }

}
