package ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        String numerosAnidados = "";

        System.out.print("Ingrese número para empezar: ");
        numero = scan.nextInt();
        
        System.out.println("----------------------------------");
        for (int i = 1; i <= numero; i++){            
            numerosAnidados += i;
            System.out.println(numerosAnidados);
        }

        scan.close();
    }
}
