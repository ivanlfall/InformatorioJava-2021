package ejercicios_complementarios_level2;


import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int start, end;

        System.out.print("Please enter a number which gonna be the start: ");
        start = scan.nextInt();
        System.out.print("Please enter a number which gonna be the end: ");
        end = scan.nextInt();


        try {
            System.out.println("\nCreating List...");
            Thread.sleep(2500);
            int[] list = createList(start, end);

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }

            System.out.println("\nDoing the magic...");
            Thread.sleep(2500);
            fizzBuzzFunction(list);
        } catch (InterruptedException e) {
            System.err.println("Something went wrong. :(");
        }

        scan.close();
    }

    public static int[] createList(int start, int end) {
        int endOfList = end - start;
        int[] arr = new int[endOfList];

        for (int i = start; i < end; i++) {
            arr[i-start] = i;
        }

        return arr;
    }

    public static void fizzBuzzFunction(int[] list) {
        String[] numbersToWords = new String[list.length];

        for (int i = 0; i < list.length; i++) {
            if(list[i] % 2 == 0 && list[i] % 3 == 0){
                numbersToWords[i] = "FizzBuzz";
            }else if (list[i] % 2 == 0) {
                numbersToWords[i] = "Fizz";
            }else if (list[i] % 3 == 0){
                numbersToWords[i] = "Buzz";
            }else{
                numbersToWords[i] = ""+list[i];
            }
        }

        for (int i = 0; i < numbersToWords.length; i++) {
            System.out.print(numbersToWords[i] + " ");
        }
    }

}
