import java.util.Arrays;

public class Selection {

    public static void main(String args[]) {
		System.out.println("Selection sorting...");
		
        int numbers[] = {12, 1, 4, 3, 7, 8, 10, 45, 11};

        System.out.println("Init: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After: " + Arrays.toString(numbers));

    }
	
	static void selectionSort (int numbers[]) {
		int min;
        int aux;

        for(int i = 0; i < numbers.length; i++) {
            min = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[min]){
                    min = j;
                }
            }
            if(i != min){
                aux = numbers[i];
                numbers[i] = numbers[min];
                numbers[min] = aux;
            }
        }
	}
}