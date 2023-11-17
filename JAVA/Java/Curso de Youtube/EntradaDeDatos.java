import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) throws Exception {
    
        Scanner testScanner = new Scanner(System.in);
        /*

        float numero;

        System.out.println("Digite un numero: ");
        

        // nextInt nos devuelve un int segun su imput
        numero = testScanner.nextFloat();


        System.out.println("numero: " + numero);
        
     */
    
        String cadena;

        System.out.println("Digite un texto: ");

        cadena = testScanner.nextLine();

        System.out.println("cadena: " + cadena);


    }


}
