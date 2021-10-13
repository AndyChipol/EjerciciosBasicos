#include <stdio.h>

int main()
{
    int opcion = 0;
    float numUno = 0, numDos = 0;

    while(true){
        printf("\nMenu\n1.-Sumar\n2.-Restar\n3.-Dividir\n4.-Multiplicar");
        printf("\nIntroduce Una opcion: ");
        scanf("%d",&opcion);
        
        switch (opcion)
        {
        case 1: 
            printf("Introduce numero 1:");
            scanf("%f",&numUno);
            printf("Introduce numero 2:");
            scanf("%f",&numDos);
            printf("Suma: %f",(numUno+numDos));
            break;
        case 2:
                printf("Introduce numero 1:");
            scanf("%f",&numUno);
            printf("Introduce numero 2:");
            scanf("%f",&numDos); 
            printf("Resta: %f",(numUno-numDos));
            break;
        case 3: 
                printf("Introduce numero 1:");
            scanf("%f",&numUno);
            printf("Introduce numero 2:");
            scanf("%f",&numDos);
            printf("Multiplicacion: %f",(numUno*numDos));
            break;
        case 4: 
            printf("Introduce numero 1:");
            scanf("%f",&numUno);
            printf("Introduce numero 2:");
            scanf("%f",&numDos);
            printf("Division: %f",(numUno/numDos));
            break;
        case 5:
            return 0;
            break;
        default:
            printf("Introduce Un Numero Valido");
            break;
        }
    }


    return 0;
}
