package ejercicios_complementarios_level1;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String word;

        System.out.print("Please enter a word: ");
        word = scan.next();

        System.out.println("--------------------------------");
        System.out.println(toUpper(word));
        scan.close();
    }

    public static String toUpper(String word) {
        final int DIFFERENCETOUPPER = 32;
        String wordToUpper = "";
        char letter;

        for (int i = 0; i < word.length(); i++) {
            letter = (char) (word.charAt(i) - DIFFERENCETOUPPER);
            wordToUpper += letter;
        }

        return wordToUpper;
    }
}
