// HerenciaPoo es una clase hija de SettersYgetters

public class HerenciaPoo extends SettersYgetters{

    private int codigoEstudiante;
    private double notaFinal;

    public HerenciaPoo( int _codigoEstudiante,double _notaFinal) {
        super();

        this.estatura = 10;
        this.codigoEstudiante = _codigoEstudiante;
        this.notaFinal = _notaFinal;
        // this.getEdad();

        System.out.println("frase desde HerenciaPoo: " + this.frase);
        System.out.println("estatura en la clase padre: " +  this.estatura );
    }


    public static void main(String[] args) {
    }
}
