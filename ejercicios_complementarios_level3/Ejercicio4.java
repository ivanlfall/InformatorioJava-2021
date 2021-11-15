package ejercicios_complementarios_level3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 4, 4, 5);

        List<Integer> restultNumbers = numbers.stream()
        .map(n -> factorial(n))
        .distinct()
        .collect(Collectors.toList());

        System.out.println("Original List: ");
        numbers.forEach(n-> System.out.println(n));
        System.out.println("-------------------------------");
        restultNumbers.forEach(n-> System.out.println(n));
    }

    public static int factorial(int number) {
        if(number == 1) return 1;
        return number * factorial(number-1);
    }
}
