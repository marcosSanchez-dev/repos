public class ConstructorEnClases {
    String nombre;
    int edad;
    String tipoSangre;

    //Metodo constructor (no lleva la palabra clave de retorno "void" ni niguna otra)
    public ConstructorEnClases(String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
    }

    //Otro metodo constructor pero con distintos parametros
    public ConstructorEnClases(String _tipoSangre){
        this.tipoSangre = _tipoSangre;
    }

    
    
}
