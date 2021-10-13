import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        int numero = 0;
        Scanner le = new Scanner(System.in);
        System.out.println("Introduce Un Numero");

        numero = le.nextInt();

        if(numero % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}
