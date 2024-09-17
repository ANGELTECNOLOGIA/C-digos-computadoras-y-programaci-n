import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Declaración de variables
        float velocidad_pato, velocidad_raton, longitud_pista;

        // Lectura de datos
        velocidad_raton = Float.parseFloat(JOptionPane.showInputDialog("Introduce la velocidad del raton (en m/s):"));
        velocidad_pato = Float.parseFloat(JOptionPane.showInputDialog("Introduce la velocidad del pato (en m/s):"));
        longitud_pista = Float.parseFloat(JOptionPane.showInputDialog("Introduce la longitud de la pista (en metros):"));

        // Cálculo de la distancia entre el pato y el ratón
        double tiempo_carrera = 3.1415*longitud_pista / ((velocidad_raton - velocidad_pato));

        // Muestra el resultado en pantalla
        JOptionPane.showMessageDialog(null, "El tiempo que tarda el ratón en alcanzar al pato es de: " + tiempo_carrera + " segundos");
    }
    
}
