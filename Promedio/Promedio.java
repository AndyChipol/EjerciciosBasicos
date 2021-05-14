import java.util.*;

class Promedio{
    public static void main(String[] args) {
        int numeroCalificaciones = 0;
        float calificacion = 0;
        float sumaTotal   = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce El numero de calificaciones:");
        numeroCalificaciones = sc.nextInt();

        for(int i =0; i < numeroCalificaciones;i++){
            System.out.println("Introduce La Calificacion:");
            calificacion = sc.nextFloat();
            sumaTotal = sumaTotal + calificacion;
        }

        System.out.println("El promedio es: " + sumaTotal/numeroCalificaciones);
    }
}