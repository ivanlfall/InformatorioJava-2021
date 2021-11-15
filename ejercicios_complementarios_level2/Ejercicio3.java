package ejercicios_complementarios_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        final int CARDSMAX = 9;
        List<Integer> spanishCards = new ArrayList<>();

        for (int i = 1; i <= CARDSMAX; i++) {
            spanishCards.add(i);
        }

        printList(spanishCards);
        System.out.println("*** Reversed List ***");
        printReversed(spanishCards);
        System.out.println("*** Disordered List ***");
        printdisordered(spanishCards);
    }

    public static void printList(List<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void printReversed(List<Integer> list){
        List<Integer> auxList = list;
        Collections.reverse(auxList);
        printList(auxList);
    }

    public static void printdisordered(List<Integer> list) {
        List<Integer> auxList = list;
        Collections.shuffle(auxList);
        printList(auxList);
    }
}
