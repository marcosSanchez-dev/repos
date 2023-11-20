package Polimorfismo;

public class Hijo2 extends PolimorfismoFile{
    String palabraHijo;

    public Hijo2(String palabraHijo, int numero, String palabra, boolean booleano){
        super(numero, palabra, booleano);
        this.palabraHijo = palabraHijo;
    }

    public void getInfo(){
        System.out.println("palabrahijo: " + palabraHijo +  " numero: " + numero + " palabra: " + palabra + " booleano: " + booleano);
    }    
}
