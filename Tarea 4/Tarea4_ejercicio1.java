import javax.swing.JOptionPane;

public class Tarea4_ejercicio1 {
    public static void main(String[] args) {
        // Inicialización de variables
        int centinela = -1;
        int numero = 0;
        int mayor = 0;
        String secuencia = "";
        int contador = 0;

        for (String entrada = JOptionPane.showInputDialog("Ingrese un número (o -1 para terminar):"); Integer
                .parseInt(entrada) != centinela; entrada = JOptionPane
                        .showInputDialog("Ingrese un número (o -1 para terminar):")) {

            numero = Integer.parseInt(entrada);

            if (contador == 0) {
                secuencia = "" + numero;
            } else {
                secuencia += ", " + numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }

            contador++;
        }

        // Validación para números negativos
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "No se pueden ingresar números negativos.");
        }

        else {
            String mensaje = "Secuencia de números ingresados: " + secuencia + "\nEl número mayor es: " + mayor;
            JOptionPane.showMessageDialog(null, mensaje);
        }

        if (numero == centinela) {
            String mensaje = "Secuencia de números ingresados: " + secuencia + "\nEl número mayor es: " + mayor;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
