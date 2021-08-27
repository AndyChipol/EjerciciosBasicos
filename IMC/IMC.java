import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {   
        float altura = 0, peso = 0, imc = 0;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduce tu altura en Metros: ");
        altura = lectura.nextFloat();
        System.out.println("Introduce tu peso en Kg: ");
        peso = lectura.nextFloat();

        imc = peso/(altura * altura);

        if(imc <= 18.4){
            System.out.println("Tu peso Esta bajo");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.print("Tu peso esta normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.print("Tienes Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.print("Tienes Obesidad Grado 1");
        }

    }
}