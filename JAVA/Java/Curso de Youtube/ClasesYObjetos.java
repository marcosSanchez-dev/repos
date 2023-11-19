public class ClasesYObjetos {
    //Atributos
   String color;
   String marca;
   public int km;
   private int numero1;
   int numero2;

   //Metodo

   /*
    Los modificadores de acceso permiten que se visualicen los atributos y metodos de una clase que este en otro paquete distinto. 
    Y en modo "private" los atributos solo pueden ser usados por metodos de la misma clase

    - public: modificador de acceso
    - void: valor de retorno (no retorna nada el tipo void)
    */
   public static void main(String[] args) {
    
    ClasesYObjetos test =  new ClasesYObjetos();
    
    test.color = "rojo";
    test.marca = "Mazda";
    test.km = 30;


    System.out.println(test.Suma());

    }


    public int Suma(){

        ClasesYObjetos otroTest = new ClasesYObjetos();

        otroTest.numero1 = 5;
        otroTest.numero2 = 5;

        return otroTest.numero1 + otroTest.numero2;
    }

    

    public double Resta(int numero1, double numero2 ){

        return numero1 - numero2;
    }
}


