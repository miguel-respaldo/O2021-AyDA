// insercion

import java.util.Arrays;

public class OrdenamientoDeInsercion {


    public static void main(String[] args) {

        System.out.println("Ordenamiento de Insercion");
        int[] nums = {1, 4, 9, 59, 23, 26, 20, 1, 23, 56, 7};
        int[] ordenarInsercion = ordenarInsercion(nums);
        
    }

    public static int[] ordenarInsercion(int[] array) {
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i - 1; j >= 0 && array[j] > aux; j--) {
                array[j + 1] = array[j];
                array[j] = aux;
            }
        }
        return array;
    }

}

