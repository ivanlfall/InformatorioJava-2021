package ejercicios_complementarios_level3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> resultList = numbersList.stream()
                                    .map(item -> (int) Math.pow(item, 2))
                                    .collect(Collectors.toList());

        System.out.println("Original List: ");
        numbersList.forEach(n -> System.out.print(n + " "));
        System.out.println("\nNumbers raised to 2");
        resultList.forEach(n -> System.out.print(n + " "));
    }
}
