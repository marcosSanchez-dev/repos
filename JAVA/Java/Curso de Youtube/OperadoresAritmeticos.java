import java.util.Scanner;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float num1, num2, num3;

        System.out.println("Digite 2 numeros: ");

        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        num3 = entrada.nextFloat();

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
