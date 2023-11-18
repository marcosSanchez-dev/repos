
public class IfElse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero =Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dame un numero: "));    
    
        System.out.println("numero: " + numero);

        if(numero == dato){
            javax.swing.JOptionPane.showMessageDialog(null, "El numero es 5");
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"El numero es otro");
        }
    }
}
