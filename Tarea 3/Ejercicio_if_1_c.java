import javax.swing.JOptionPane;

public class Ejercicio_if_1_c {
        public static void main(String[] args) {
                int numero1, numero2, numero3, numero4;

                numero1 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce el primer número: "));

                numero2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce el segundo número: "));

                numero3 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce el tercer número: "));

                numero4 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce el cuarto número: "));

                // comparamos cada numero con los otros 3
                if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));

                if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero2));

                if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero3));

                if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero4));

                // si los tres son iguales
                if (numero1 == numero2 && numero2 == numero3 && numero3 == numero4)
                        JOptionPane.showMessageDialog(null,
                                        String.format("Los numeros son iguales"));

                // si dos números son iguales y uno diferente
                if (numero1 == numero3 && numero2 == numero4 && numero1 < numero2)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero2));

                if (numero1 == numero2 && numero3 == numero4 && numero1 < numero3)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero3));

                if (numero1 == numero2 && numero3 == numero4 && numero1 > numero3)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));

                if (numero1 == numero4 && numero3 == numero2 && numero1 < numero3)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero2));

                if (numero1 == numero4 && numero3 == numero2 && numero1 > numero3)
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));
                // si tres numeros son iguales y uno diferente
                if (numero1 == numero2 && numero2 == numero3 && numero3 > numero4) {
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));
                }
                if (numero1 == numero2 && numero2 == numero4 && numero1 > numero3) {
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));
                }
                if (numero1 == numero3 && numero3 == numero4 && numero1 > numero2) {
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero1));
                }
                if (numero2 == numero3 && numero3 == numero4 && numero2 > numero1) {
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero2));
                }
                if (numero1 == numero3 && numero3 == numero4 && numero1 < numero2) {
                        JOptionPane.showMessageDialog(null,
                                        String.format("El mayor es: %d", numero2));
                }
        }

}
