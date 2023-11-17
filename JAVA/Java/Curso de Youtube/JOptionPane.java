
public class JOptionPane {
    
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena =  javax.swing.JOptionPane.showInputDialog("Dame un string: ");
        entero = Integer.parseInt( javax.swing.JOptionPane.showInputDialog("Dame un int: "));
    
        System.out.println("cadena: " + cadena);
        System.out.println("entero: " + entero);

        javax.swing.JOptionPane.showMessageDialog(null, "cadena que escribiste: " + cadena);
    }
}
