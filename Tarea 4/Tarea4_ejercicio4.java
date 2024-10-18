import javax.swing.JOptionPane;

public class Tarea4_ejercicio4 {
    public static void main(String[] args) {
        // Leer los datos de entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog("Longitud de la barra:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Longitud del lado vertical:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Longitud del lado horizontal:"));
        
        // Calcular la longitud de madera necesaria para una puerta
        int maderaPorPuerta = 2 * a + b;
        
        // Calcular la madera necesaria para dos puertas
        int maderaNecesaria = 2 * maderaPorPuerta;
        
        // Inicializar el contador de barras
        int barrasNecesarias = 0;
        
        // Mientras haya madera por cubrir
        while (maderaNecesaria > 0) {
            // Restamos la longitud de una barra al total de madera necesaria
            maderaNecesaria -= n;
            // Aumentamos el contador de barras necesarias
            barrasNecesarias++;
        }
        
        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "El número mínimo de barras necesarias es: " + barrasNecesarias);
    }
}
