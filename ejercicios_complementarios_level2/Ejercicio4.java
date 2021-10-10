// package ejercicios_complementarios_level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        fillList(students);
        System.out.println("Current List");
        printList(students);

        System.out.println("List Splitted");
        splitList(students);
    }

    public static void fillList(List<String> list) {
        
        list.add("Ivan");
        list.add("Rocio");
        list.add("Joel");
        list.add("Braian");
        list.add("Noemi");
        list.add("José Luis");
        list.add("Andrea");
        list.add("Agustina");
        list.add("Marita");
        list.add("Patricia");
        list.add("Mercedes");
        list.add("Cesar");
    }

    public static void printList(List<String> list) {
        for (String item : list) {
            if (list.indexOf(item) == list.size()-1) {
                System.out.print(item);
            }else{
                System.out.print(item + " - ");
            }
        }
        System.out.println();
    }

    public static void splitList(List<String> list) {

        List<String> class1 = list.subList(0, 4);
        List<String> class2 = list.subList(4, 8);
        List<String> class3 = list.subList(8, 12);

        printList(class1);
        printList(class2);
        printList(class3);
    }
}
