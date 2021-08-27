#include <stdio.h>

int main(){
    float altura = 0,peso = 0 ,imc = 0;

    printf("Introduzca su altura en Metros: ");
    scanf("%f", &altura);

    printf("Introduzca su peso en Kilogramos: ");
    scanf("%f", &peso);

    imc = peso / (altura * altura);

    if(imc <= 18.4){
        printf("Estas Bajo de Peso");
    } 
    else if(imc >= 18.4 && imc < 25){
        printf("Estas en un Peso Normal");
    }
    else if(imc >= 25 && imc < 30){
        printf("Tienes Sobrepeso");
    }else if(imc >= 30 && imc < 35){
        printf("Tienes Obesidad Grado 1");
    }

    return 0;
}