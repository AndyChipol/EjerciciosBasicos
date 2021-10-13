import java.util.Scanner;

/**
 * Absoluto
 */
public class Absoluto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero  = 0;

        System.out.println("Introduce Tu Numero: ");

        numero = leer.nextInt();

        if(numero < 0){
            System.out.println("Valor Absoluto: " +numero * (-1) );
        }else if(numero >= 0){
            System.out.println("Valor Absoluto: " + numero );
        }
    }
}