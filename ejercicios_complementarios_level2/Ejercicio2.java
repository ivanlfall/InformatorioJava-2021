package ejercicios_complementarios_level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(45);
        numbers.add(65);
        numbers.add(7);

        System.out.println("*** Current List ***");
        printList(numbers);

        System.out.println("\n-----------------------------------");
        System.out.println("List with an additional number inserted at first");
        insertAtfirst(numbers, 100);
        printList(numbers);

        System.out.println("\n-----------------------------------");
        System.out.println("List with an additional number inserted at the end");
        insertAtEnd(numbers, 200);
        printList(numbers);

    }

    public static void insertAtfirst(List<Integer> list, int number) {
        list.add(0, number);
    }
    public static void insertAtEnd(List<Integer> list, int number) {
        list.add(list.size(), number);
    }

    public static void printList(List<Integer> list){
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
