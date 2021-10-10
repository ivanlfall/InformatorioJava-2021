package Ejercicios.ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2;


        System.out.println("**** Debes ingresar DOS números para realizar operaciones con ellos ****");
        System.out.print("Ingrese el primer número: ");
        numero1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = scan.nextInt();

        calcular(numero1, numero2);

        scan.close();
    }

    public static void calcular(int numero1, int numero2) {
        System.out.println(String.format("%d + %d = %d", numero1, numero2, numero1+numero2));
        System.out.println(String.format("%d - %d = %d", numero1, numero2, numero1-numero2));
        System.out.println(String.format("%d * %d = %d", numero1, numero2, numero1*numero2));
        if (numero2 == 0){
            System.out.println("No puedes dividir por CERO");
        }else{
            System.out.println(String.format("%d / %d = %d", numero1, numero2, numero1/numero2));
            System.out.println(numero1 + " % " + numero2 + " = " + numero1%numero2);
        }
    }
}
