#include <stdio.h>

int main(){
    int numero  = 0;
    printf("Introduce Un Numero: ");
    scanf("%d",&numero);

    if(numero < 0){
        printf("Valor Absoluto: %d",numero*(-1));
    }else if(numero >= 0){
        printf("Valor Absoluto: %d",numero);
    }

    return 0;
}