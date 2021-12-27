import java.util.Arrays;
public class Bubble {

    public static void main(String[] args) {
        System.out.println("Bubble ordering...");

        int numbers[] = {15, 8, 33, 40, 5, 10, 17, 7, 23};
        System.out.println("Init: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After: " + Arrays.toString(numbers));

    }
	
    private static void bubbleSort(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            for (int y = 0; y < numbers.length - 1; y++) {
                int a = numbers[y], b = numbers[y + 1];
                if (a > b) {
                    numbers[y] = b;
                    numbers[y + 1] = a;
                }
            }
        }
    }
