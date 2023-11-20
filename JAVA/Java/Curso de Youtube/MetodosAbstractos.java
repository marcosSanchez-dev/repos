/*
 Los metodos abstractos son utiles cuando sabes que los hijos de la clase deben ejecutar una accion pero cada hijo lo hará a su manera
  
  
 */

public abstract class MetodosAbstractos {
    
    public abstract void alimentarse();

}



/* Ejemplo de una clase hija sobreescribiendo un metodo abstracto */

/*

*********** Clase que NO quiere implementar el metodo abstracto ***********


public abstract class claseHija extends MetodosAbstractos{

 
}


*********** Clase que SI quiere implementar el metodo abstracto ***********

public class claseHija extends MetodosAbstractos{

    @Override
    public void alimentarse(){
        System.out.println("soy un hijo y me alimento con esta logica que colocare en la funcion");
    };
}

 */