import java.util.Scanner;
/**
 * Sumar
 */
public class Sumar {

    public static void main(String[] args) {
        int numero = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce Un Numero");

        numero = in.nextInt();
        int suma = 0;

        for (int i = 0; i <= numero; i++)
            suma += i;   

        System.out.println("El Resultado es: "+ suma);

    }
}