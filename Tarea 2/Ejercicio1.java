import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Declarar las variables que se van a usar para la resolución del problema
        int horas_estacionado, minutos_estacionado;
        double precio, total;
        
        // Pedir al usuario los datos (horas y minutos que se va a estacionar)
        horas_estacionado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas estacionado"));
        minutos_estacionado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos estacionado"));

        // Calcular el precio total según las horas y minutos estacionados
        precio = (45 * horas_estacionado + 0.75 * minutos_estacionado);
        total = precio;

        // Mostrar el precio al usuario
        JOptionPane.showMessageDialog(null, "El precio total de la estacionamiento es $" + total);
    }
}