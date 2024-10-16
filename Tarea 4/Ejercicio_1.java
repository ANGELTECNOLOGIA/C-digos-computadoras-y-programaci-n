import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Inicialización de variables
        final int centinela = -1; // Valor que termina el ciclo
        int numero = 0; // Número ingresado por el usuario
        int mayor = Integer.MIN_VALUE; // Inicializamos el numero mayor con el menor valor posible
        String secuencia = ""; // Almacenará la secuencia de números ingresados
        int contador = 0; // Para controlar la primera vez que se ingresa un número

        // Ciclo for para ingresar números hasta que el usuario ingrese el centinela
        // (-1)
        for (String entrada = JOptionPane.showInputDialog("Ingrese un número (o -1 para terminar):"); 
            Integer.parseInt(entrada) != centinela; 
            entrada = JOptionPane.showInputDialog("Ingrese un número (o -1 para terminar):")) {

            numero = Integer.parseInt(entrada); // Convertimos la entrada en entero

            // Actualizamos la secuencia de números
            if (contador == 0) {
                secuencia = "" + numero; // Guardamos el primer número en la secuencia
            } else {
                secuencia += ", " + numero; // Agregamos el número a la secuencia
            }

            // Actualizamos el número mayor si es necesario
            if (numero > mayor) {
                mayor = numero;
            }

            contador++; // Incrementamos el contador de números ingresados
        }

        // Verifica si se ingresaron números válidos antes del centinela
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No se ingresaron números.");
        } else {
            // Mostrar la secuencia de números ingresados y el mayor en una ventana
            String mensaje = "Secuencia de números ingresados: " + secuencia + "\nEl número mayor es: " + mayor;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
