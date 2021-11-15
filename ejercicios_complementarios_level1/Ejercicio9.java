package ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String text;
        char letter;

        System.out.print("Please enter the text to analyze: ");
        text = scan.nextLine();
        System.out.print("Enter the letter to search: ");
        letter = scan.next().charAt(0);

        System.out.println("--------------------------");
        System.out.println(countOneLetter(text, letter));

        scan.close();
    }

    public static int countOneLetter(String text, char letter) {
        
        int letterCounter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) letterCounter++;
        }
        return letterCounter;
    }
}
