package ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, address, city;
        int age;


        System.out.println("PLEASE COMPLETE THE DATA");
        System.out.print("Name: ");
        name = scan.nextLine();

        System.out.print("Age: ");
        age = scan.nextInt();
        
        System.out.print("Address: ");
        address = scan.nextLine();

        System.out.print("City: ");
        city = scan.nextLine();

        System.out.println("-------------------------------------");
        System.out.println(printWithFormat(name, address, city, age));
        scan.close();
    }

    public static String printWithFormat(String name, String address, String city, int age) {
        
        return String.format("%s - %s - %d - %s", city, address, age, name);
    }
}
