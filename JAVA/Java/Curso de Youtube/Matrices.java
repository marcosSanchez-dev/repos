public class Matrices {

    public static void main(String[] args) {

        //int matrix = new int[numeroDeFilas][numeroDeColumnas]
        
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int target = 0;
        int i = 0;
        for (int[] arreglo : matriz) {
            i += 1;
            for (int item : arreglo) {
                System.out.print("[" + item + "]");
            }
            System.out.println(" -- fila: " + i  + " index: " + target + " valor: " + arreglo[target]);
            System.out.println("\n"); 

        }

    }
    
}
