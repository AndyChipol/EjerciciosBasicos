#include <stdio.h>

int main(){
    int numeroPara = 0;
    int i = 0, suma = 1;
    printf("Introduce un numero: ");
    scanf("%d",&numeroPara);

    for(i=1;i <= numeroPara; i++){
        suma = suma * i;
    }

    printf("Suma Total: %d",suma);

    return 0;
}