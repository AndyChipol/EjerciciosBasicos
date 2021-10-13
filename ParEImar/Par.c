#include <stdio.h>
int main(){
    int numero = 0;
    printf("Introduce Un numero: ");

    scanf("%d",&numero);
    
    if(numero % 2 == 0)
        printf("Es un Numero par");
    else
        printf("Es un Numero impar");

    return 0;
}