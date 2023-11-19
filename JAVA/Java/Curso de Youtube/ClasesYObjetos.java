public class ClasesYObjetos {
    //Atributos
   String color;
   String marca;
   int km;
   int numero1;
   int numero2;

   //Metodo

   /*
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


