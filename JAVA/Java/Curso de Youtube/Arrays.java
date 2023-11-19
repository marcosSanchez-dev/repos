import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner lenghtArreglo = new Scanner(System.in);

        // int lenghtArreglo =Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Dame el length del arreglo: ")) ;
        // int[] numeros = {1,2,3};

        System.out.println("Danme el nuero de largo del arreglo :\n");

        /*
        De esta forma puedes declarar un nuevo array con 3 elementos (vacios)

        int[] testArray = new int[3];

         */
        String[] numeroDeItems = new String[lenghtArreglo.nextInt()];


        // testArray[0] = 1;
        // testArray[1] = 2;
        // testArray[2] = 3;

        //System.out.println("testArray: " + testArray);

        //int longitud =  lenghtArreglo
        for (int i = 0; i <= numeroDeItems.length - 1; i++) {

            String elementosArreglo = javax.swing.JOptionPane.showInputDialog("Dame los elementos que van dentro del arreglo: ");
            numeroDeItems[i] = elementosArreglo;

        }

            System.out.println("Contenido del array numeroDeItems:");

            for (String elemento : numeroDeItems) {
                System.out.print(elemento + " ");
            }

    }
}
