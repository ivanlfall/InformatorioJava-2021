package Ejercicios.ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, exponente;

        System.out.println("*** VOY A CALCULAR LA POTENCIA DE UN NUMERO POR TI ***");
        System.out.print("Ingresa la base: ");
        base = scan.nextInt();
        System.out.print("Ingresa el exponente: ");
        exponente = scan.nextInt();

        System.out.println("---------------------------");
        System.out.println(base + " elevado a " + exponente + " = " + calcularPotencia(base, exponente));

        scan.close();
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
