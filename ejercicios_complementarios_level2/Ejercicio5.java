package ejercicios_complementarios_level2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        List<Integer> workedhours = new ArrayList<>();
        List<Integer> pricesPerHour = new ArrayList<>();

        try {
            System.out.println("Loading Data...");
            Thread.sleep(2000);
            fillWorkedHours(workedhours);
            fillPricePerHour(pricesPerHour);

            System.out.println("--- Worked Hours ---");
            System.out.println(workedhours);

            System.out.println("--- Price per hour ---");
            System.out.println(pricesPerHour);

            System.out.println("\nProcessing Data...");
            Thread.sleep(3000);
            System.out.println("Calculation of final prices");
            System.out.println(calculateTotalPerDay(workedhours, pricesPerHour));
            System.out.println("Total Final: $" + calculateTotalPrice(calculateTotalPerDay(workedhours, pricesPerHour)));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> calculateTotalPerDay(List<Integer> hours, List<Integer> prices) {
        
        ArrayList<Integer> fullPrice = new ArrayList<>();
        hours.forEach(item -> {
            int result = item * prices.get(hours.indexOf(item)) ;
            fullPrice.add(result);
        });
        
        return fullPrice;
    }

    public static int calculateTotalPrice(List<Integer> list) {
        int result = 0;
        for (Integer item : list) {
            result += item;
        }

        return result;
    }

    public static void fillWorkedHours(List<Integer> list){
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(5);
    }

    public static void fillPricePerHour(List<Integer> list){
        list.add(350);
        list.add(345);
        list.add(550);
        list.add(600);
        list.add(320);
    }
}
