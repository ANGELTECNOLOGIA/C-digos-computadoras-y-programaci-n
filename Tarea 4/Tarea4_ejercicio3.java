import java.util.Scanner;

public class Tarea4_ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas;

        System.out.print("Ingrese el número de filas: ");
        filas = scanner.nextInt();

        if (filas % 2 == 0 || filas < 3) {
            System.out.println("No se pudo mostrar el programa");
            scanner.close();
            return;
        }

        int mitad = filas / 2;

        for (int i = 0; i < filas; i++) {
            int numEstrellas;
            int numEspacios;

            if (i <= mitad) {
                numEstrellas = 2 * i + 1;
            } else {
                numEstrellas = 2 * (filas - i - 1) + 1;
            }
            numEspacios = (filas - numEstrellas) / 2;

            for (int j = 0; j < filas; j++) {
                if (j < numEspacios) {
                    System.out.print(" ");
                } else if (j < numEspacios + numEstrellas) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
