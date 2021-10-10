package Ejercicios.ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("*** VOY A MULTIPLICAR POR SUMAS SUCESIVAS ***");
        System.out.print("Ingresa el primer número: ");
        numero1 = scan.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numero2 = scan.nextInt();

        System.out.println("-----------------------------------");
        System.out.println(numero1 + " x " + numero2 + " = " + multiplicarXSumasSucesivas(numero1, numero2));

        scan.close();
    }

    public static int multiplicarXSumasSucesivas(int numero1, int numero2) {
        
        int resultado = 0;

        for (int i = 1; i <= numero2; i++) {
            resultado += numero1;
        }

        return resultado;
    }
}
