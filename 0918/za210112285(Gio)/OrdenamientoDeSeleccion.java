import java.util.Arrays;

public class OrdenamientoDeSeleccion {

    public static void main(String[] args) {

        System.out.println("Ordenamiento de seleccion");
        int[] nums = {15, 8, 33, 40, 5, 10, 17, 7, 23};
        System.out.println("=> " + Arrays.toString(nums));
        int[] ordenarSeleccion = seleccion(nums);
        System.out.println("* " + Arrays.toString(ordenarSeleccion));

    }


    public static int[] seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
            System.out.println(Arrays.toString(A));
        }

        return A;
    }
}
