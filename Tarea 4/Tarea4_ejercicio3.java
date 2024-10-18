import java.util.Scanner;

public class Tarea4_ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas;

        // Solicitar al usuario el número de filas
        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextInt();

        // Validar que el número de filas sea impar y mayor que 3
        if (filas % 2 == 0 || filas < 3) {
            System.out.println("No se pudo mostrar el programa");
            scanner.close();
            return;
        }

        int mitad = filas / 2; // Calcular la mitad

        // Ciclo principal para controlar las filas
        for (int i = 0; i < filas; i++) {
            int numEstrellas;
            int numEspacios;

            // Condiciones para determinar el número de estrellas y espacios
            if (i <= mitad) {
                numEstrellas = 2 * i + 1;
            } else {
                numEstrellas = 2 * (filas - i - 1) + 1;
            }
            numEspacios = (filas - numEstrellas) / 2;

            // Ciclo anidado para imprimir los espacios y las estrellas
            for (int j = 0; j < filas; j++) {
                if (j < numEspacios) {
                    System.out.print(" "); // Imprimir espacios
                } else if (j < numEspacios + numEstrellas) {
                    System.out.print("*"); // Imprimir estrellas
                }
            }

            // Salto de línea después de cada fila
            System.out.println();
        }

        scanner.close();
    }
}
