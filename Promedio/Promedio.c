#include <stdio.h>

int main()
{
    int numeroCalificaciones;
    float calificacion;
    float sumaTotal;
    printf("Introduce El numero De Calificaciones");
    scanf("%d",&numeroCalificaciones);
    
    int i = 0;
    for(i = 0; i < numeroCalificaciones;i++){
        printf("Introduce La Calificacion: ");
        scanf("%f",&calificacion);
        sumaTotal = sumaTotal + calificacion;
    }
    printf("El Promedio es: %f",sumaTotal/numeroCalificaciones);
    return 0;
}
