import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcion = 5;
        float numUno = 0f, numDos = 0f; 
        boolean salir = true; //verdareo -> true
        Scanner in = new Scanner(System.in);

        while(salir){
    
            System.out.println("Menu:\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Divisio\n5.-Salir");
            System.out.println("Introduce Una Opcion: ");
            opcion = in.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce Numero Uno: ");      
                    numUno = in.nextFloat();
                    System.out.println("Introduce Numero Dos: ");      
                    numDos = in.nextFloat();
                    System.out.println("Suma: "+ (numUno+numDos));
                    break;
                case 2:
                    System.out.println("Introduce Numero Uno: ");      
                    numUno = in.nextFloat();
                    System.out.println("Introduce Numero Dos: ");      
                    numDos = in.nextFloat();
                    System.out.println("Resta: "+ (numUno-numDos));
                    break;
                case 3:
                    System.out.println("Introduce Numero Uno: ");      
                    numUno = in.nextFloat();
                    System.out.println("Introduce Numero Dos: ");      
                    numDos = in.nextFloat();
                    System.out.println("Multiplicacion: "+ (numUno*numDos));
                    break;
                    
                case 4:
                    System.out.println("Introduce Numero Uno: ");      
                    numUno = in.nextFloat();
                    System.out.println("Introduce Numero Dos: ");      
                    numDos = in.nextFloat();    
                    System.out.println("Division: "+ (numUno/numDos));
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Numero No valido");
                    break;
            }
        }

    }
}
