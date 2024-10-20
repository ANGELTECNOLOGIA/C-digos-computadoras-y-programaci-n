import javax.swing.JOptionPane;

public class Tarea4_ejercicio4 {
    public static void main(String[] args) {
        
        int longitudDeLaBarra = Integer.parseInt(JOptionPane.showInputDialog("Longitud de la barra:"));
        int ladoVertical = Integer.parseInt(JOptionPane.showInputDialog("Longitud del lado vertical:"));
        int ladoHorizontal = Integer.parseInt(JOptionPane.showInputDialog("Longitud del lado horizontal:"));
        
        int maderaPorPuerta = 2 * ladoVertical + ladoHorizontal;
        
        int maderaNecesaria = 2 * maderaPorPuerta;
        
        int barrasNecesarias = 0;
        
        while (maderaNecesaria > 0) {
            maderaNecesaria -= longitudDeLaBarra;
            barrasNecesarias++;
        }

        JOptionPane.showMessageDialog(null, "El número mínimo de barras necesarias es: " + barrasNecesarias);
    }
}
