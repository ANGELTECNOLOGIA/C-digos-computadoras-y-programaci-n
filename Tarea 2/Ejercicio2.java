import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Declaramos las variables
        float numero_real_1, numero_complejo_1, numero_real_2, numero_complejo_2;

        // Pedimos al usuario los valores para los números reales y complejos
        numero_real_1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer número real:"));
        numero_complejo_1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce su parte compleja:"));
        numero_real_2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo número real:"));
        numero_complejo_2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce su parte compleja:"));

        // Hacemos las operaciones correspondientes

        // Calculamos la suma de los dos números complejos
        float suma_real = numero_real_1 + numero_real_2;
        float suma_complejos = numero_complejo_1 + numero_complejo_2;

        // Calculamos la resta de los dos números complejos
        float resta_real = numero_real_1 - numero_real_2;
        float resta_complejos = numero_complejo_1 - numero_complejo_2;

        // Calculamos la multiplicación de los dos números complejos
        float multiplicacion_real = numero_real_1 * numero_real_2;
        float multiplicacion_complejos = numero_complejo_1 * numero_complejo_2;

        // Calculamos la division de los dos números complejos
        float division_real = numero_real_1 / numero_real_2;
        float division_complejos = numero_complejo_1 / numero_complejo_2;

        // Mostramos los resultados en pantalla
        JOptionPane.showMessageDialog(null, "Suma: " + suma_real + " + " + suma_complejos + "i" + "\n" +
                                            "Resta: " + resta_real + " + " + resta_complejos + "i" + "\n" +
                                            "Multiplicación: " + multiplicacion_real + " + " + multiplicacion_complejos + "i" + "\n" +
                                            "División: " + division_real + " + " + division_complejos + "i");
    }

}
