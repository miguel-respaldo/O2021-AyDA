import java.util.Arrays;

public class TiemposOrdenamientoDeInsercion {


    public static void main(String[] args) {

        System.out.println("Ordenamiento de Insercion");
        int[] nums = {15, 8, 33, 40, 5, 10, 17, 7, 23};
        System.out.println("=> " + Arrays.toString(nums));
        int[] ordenarInsercion = ordenarInsercion(nums);
        System.out.println("* " + Arrays.toString(ordenarInsercion));

    }

    public static int[] ordenarInsercion(int[] array) {
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i - 1; j >= 0 && array[j] > aux; j--) {
                array[j + 1] = array[j];
                array[j] = aux;

            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

}
