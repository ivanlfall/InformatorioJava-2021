package ejercicios_complementarios_level3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Batman", "Ivan", "black", "Spider", "Iron", "Blue");

        int wordStartedWithB = (int)wordsList.stream()
            .filter(w -> w.toLowerCase().charAt(0)=='b')
            .count();

        System.out.println("List: ");
        wordsList.forEach(w -> System.out.println("\t"+w));
        System.out.println("Total words started with B/b: " + wordStartedWithB);
    }
}
