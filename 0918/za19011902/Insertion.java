import java.util.Arrays;

public class Insertion {

    public static void main(String args[]) {
		System.out.println("Insertion sorting...");
		
        int numbers[] = {12, 1, 4, 3, 7, 8, 10, 45, 11};

        System.out.println("Init: " + Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println("After: " + Arrays.toString(numbers));

    }

    static void insertionSort (int numbers[]) {
        int aux;
        int cont1;
        int cont2;

        for(cont1 = 1; cont1 < numbers.length; cont1++) {
            aux = numbers[cont1];
            for(cont2 = cont1 - 1; cont2 >= 0 && numbers[cont2] > aux; cont2--) {
                numbers[cont2 + 1] = numbers[cont2];
                numbers[cont2] = aux;
            }
        }
    }
}