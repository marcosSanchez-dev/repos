public class SettersYgetters {

    //protected permite que el atributo sea visible para la clase misma y sus hijos
    protected int estatura;
    
    private int edad;
    /* 
     un atributo "static" te da la posibilidad de desvicular la propiedad de cada copia de objeto, y que su valor solo este definido por su clase. 
     Es decir, el ultimo valor que haya sido aplicado sobre un atributo "static" es el valor que tendran TODAS sus instancias.
    
     Los metodos tambien pueden ser estaticos como los atributos, y la principal funcion puede ser que ya no necesitas instanciar la clase para usar el metodo estatico
     */
    public static String frase;

    // "final" declara como constante una variable y ya no se podra cambiar su valor
    public final String nombre;

    //constructor
    public SettersYgetters() {
        System.out.println("Soy el constructor de SettersYgetters");
        
        //Las variables que sean seteadas en la clase padre (asi como this.nombre), deben ser declaradas como argumentos en los constructores de las clases hijas y ser pasado hacia el metodo super.
        this.nombre = "Marcos";
        //VSCode me recomienda setear de esta forma los atributos estaticos
        SettersYgetters.frase = "Hola mundo, soy el constructor de SettersYgetters";
    }

    /*
     Este setter permite acceder a la propiedad edad sin importar si es private
     por eso es llamado Setter

     Con los setter y los getters podemos manipular atibutos de la clase que esten encapsulados
      
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    /* Overrride method */

    public void comer(){
        System.out.println("comiendo desde la clase padre SettersYgetters");
    }

    public static void main(String[] args) {
        SettersYgetters tesObj1 = new SettersYgetters();
        SettersYgetters tesObj2 = new SettersYgetters();


        tesObj1.frase = "Adios mundo";

        System.out.println("primer objeto: " + tesObj1.frase);
        System.out.println("segundo objeto: " + tesObj2.frase);
    
        //Cuando la clase se vuelve dueña del atributo (static) ya puedes usar el atributo sin necesidad de instanciar una clase
        System.out.println("La clase es dueña del atributo: " + SettersYgetters.frase);
    }
}
