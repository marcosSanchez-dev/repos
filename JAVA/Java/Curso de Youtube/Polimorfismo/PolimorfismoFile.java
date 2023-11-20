package Polimorfismo;
public class PolimorfismoFile {
    int numero;
    String palabra;
    boolean booleano;

    public PolimorfismoFile(int numero, String palabra, boolean booleano) {
        this.numero = numero;
        this.palabra = palabra;
        this.booleano = booleano;

    }

    public void getInfo(){
        System.out.println("numero: " + numero + " palabra: " + palabra + " booleano: " + booleano);
    }

}
