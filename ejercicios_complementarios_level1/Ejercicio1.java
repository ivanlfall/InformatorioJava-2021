package Ejercicios.ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String usuario;

        System.out.print("Ingrese nombre de usuario: ");
        usuario = scan.nextLine();

        System.out.println("HOLA " + usuario);
        scan.close();
    }
}
