package ejercicios_complementarios_level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();

        fillList(wordsList);
        System.out.println("Original List");
        wordsList.forEach(x -> System.out.println(x));
        System.out.println("-----------------------------------");
        System.out.println("List without nulls and empties: ");
        wordsList.stream()
                                    .filter(word -> !(word==null) && (!("").equals(word)))
                                    .collect(Collectors.toList())
                                    .forEach(item -> System.out.println(item));;
    }

    public static void fillList(List<String> lista) {
        lista.add("Hello");
        lista.add(null);
        lista.add("Bye");
        lista.add("");
        lista.add("Greetings");
    }
}
