#include <stdio.h>

int main(){
    int numero = 0;
    printf("Introduce Un Numero: ");
    scanf("%d",&numero);

    if(numero > 0)
        printf("Es un numero Positivo");
    else if(numero < 0)
        printf("Es un numero Negativo");
    else 
        printf("Es Neutro");

    return 0;
}