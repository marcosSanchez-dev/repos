package Polimorfismo;

public class Hijo1 extends PolimorfismoFile {
    int numeroDelHijo;


    public Hijo1(int numeroDelHijo,int numero, String palabra, boolean booleano) {
        super(numero, palabra, booleano);

        this.numeroDelHijo = numeroDelHijo;
    }


    public void getInfo(){
        System.out.println("numeroDelHijo: " + numeroDelHijo + " numero: " + numero + " palabra: " + palabra + " booleano: " + booleano);
    }
}
