import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones {

    public Excepciones(){

        this.leerArchivo();
    }

    public static void main(String[] args) {
        /*         int num1 = 5, num2 = 0;

        int x = num1 /  num2;

        System.out.println(x);

        */

        

    }

    //Declaracion de una excepcion verificada:


    // antes de agregar la linea fr.close() la funcion me daba un FileNotFoundException, pero como es una clase hija de IOException tabien puedo declararlo de esta manera:
    public void leerArchivo() throws IOException, FileNotFoundException{
        File archivo = new File("../bin/Holamundo.txt");

        FileReader fr = new FileReader(archivo);

        fr.close();
    }

        public void leerArchivo2() {

            try {
                //el error ocurre donde llamo al metodo debido a las declaraciones throws que hice en el metodo del error.
                leerArchivo();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("soy un finally");
            }


        /* 
        File archivo = new File("../bin/Holamundo.txt");

        FileReader fr;
        try {
            fr = new FileReader(archivo);

        //  FileNotFoundException hace la funcion de la declaracion del tipo de una clase cuando "e" es el objeto o el error
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */

    }
}
