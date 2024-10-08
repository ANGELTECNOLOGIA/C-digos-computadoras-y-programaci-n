import javax.swing.JOptionPane;

public class Ejercicio_if_1_a {
    public static void main(String[] args) {

        // Pedimos al usuario que ingrese 4 números
        int numero1, numero2, numero3, numero4;

        // convertimos los strings a enteros con el metodo parseInt()
        numero1 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Introduce un número: "));

        numero2 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Introduce un número: "));

        numero3 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Introduce un número: "));

        numero4 = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Introduce un número: "));

        // entra al if si numero 1 es mayor o igual a numero 2
        if (numero1 >= numero2) {
            // entra al if si numero 1 es mayor o igual a numero 3
            if (numero1 >= numero3) {
                // entra al if si numero 1 es mayor o igual a numero 4
                if (numero1 >= numero4) {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero1);
                }
                // entra al else si numero 1 es menor a numero 4
                else {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero4);
                }
            }
            // entra al else si numero 1 es menor a numero 3
            else {
                // entra al if si numero 3 es mayor o igual a numero 4
                if (numero3 >= numero4) {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero3);
                }
                // entra al else si numero 3 es menor a numero 4
                else {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero4);
                }
            }
        }
        // entra al else si numero 2 es mayor
        else {
            // entra al if si numero 2 es mayor o igual a numero 3
            if (numero2 >= numero3) {
                // entra al if si numero 2 es mayor o igual a numero 4
                if (numero2 >= numero4) {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero2);
                }
                // entra al else si numero 2 es menor a numero 4
                else {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero4);
                }
            }
            // entra al else si numero 2 es menor a numero 3
            else {
                // entra al if si numero 3 es mayor o igual a numero 4
                if (numero3 >= numero4) {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero3);
                }
                // entra al else si numero 3 es menor a numero 4
                else {
                    JOptionPane.showMessageDialog(null, "El mayor es: " + numero4);
                }
            }
        }

    }

}
