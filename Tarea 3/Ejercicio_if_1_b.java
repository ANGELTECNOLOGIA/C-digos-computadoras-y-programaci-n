import javax.swing.JOptionPane;

public class Ejercicio_if_1_b {
    public static void main(String[] args) {

        int numero1, numero2, numero3, numero4;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));

        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));

        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número: "));

        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cuarto número: "));

        if (numero1 >= numero2) {
            if (numero1 >= numero3) {
                if (numero1 >= numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero1));
                }
                if (numero1 < numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero4));
                }
            }
            if (numero1 < numero3) {
                if (numero3 >= numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero3));
                }
                if (numero3 < numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero4));
                }
            }
        }

        // esta es la parte del else pero con la condicion del if contraria
        if (numero1 < numero2) {
            if (numero2 >= numero3) {
                if (numero2 >= numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero2));
                }

                if (numero2 < numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero4));
                }
            }
            if (numero2 < numero3) {
                if (numero3 >= numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero3));
                }

                if (numero3 < numero4) {
                    JOptionPane.showMessageDialog(null,
                            String.format("El mayor es: %d", numero4));
                }
            }
        }
    }

}