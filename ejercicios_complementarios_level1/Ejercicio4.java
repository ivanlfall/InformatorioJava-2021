package ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("*** VOY A CALCULAR EL FACTORIAL DE UN NUMERO POR TI ***");
        System.out.print("Ingresa el numero: ");
        numero = scan.nextInt();

        System.out.println("----------------------------");
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

        scan.close();
    }

    public static int calcularFactorial(int numero) {
        if (numero == 1) return 1;

        return numero * calcularFactorial(numero-1);
    }
}
