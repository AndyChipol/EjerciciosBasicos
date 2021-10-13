import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numero = 0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduce Tu numero");
        numero = lectura.nextInt();

        if(numero > 0)
            System.out.println("Es positivo");
        else if(numero < 0 )
            System.out.println("Es Negativo");
        else if (numero == 0){
            System.out.println("Es neutro");
        }
    }
}
