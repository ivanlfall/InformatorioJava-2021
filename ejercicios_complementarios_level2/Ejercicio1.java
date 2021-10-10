// package ejercicios_complementarios_level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<String> cities = new ArrayList<>();

        System.out.println("*** Please enter your favorites cities ***");
        for (int i = 0; i<3;i++){
            System.out.print("Enter the city N° " + (i+1) + ": ");
            cities.add(scan.nextLine());
        }

        printRanking(cities);
        scan.close();
    }
    
    public static void printRanking(List<String> cities) {
        
        for (String city : cities) {
            System.out.println((cities.indexOf(city)+1) + "# - " + city);
        }
    }
}
