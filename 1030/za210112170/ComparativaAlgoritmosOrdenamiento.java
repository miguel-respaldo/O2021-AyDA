import java.util.Scanner;
/*By Yazmin Salinas Perez */
public class ComparativaAlgoritmosOrdenamiento {
    static long tiempoInicio;
    static long tiempoFinal;

    public static class ArrayFactory {
        public int[] getNewArray() {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese la dimension del arreglo: ");
            int tam = teclado.nextInt();
            int arreglo[] = new int[tam];
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print("A[" + i + "]= ");
                arreglo[i] = teclado.nextInt();
            }
            return arreglo;
        }
    }


    public static void main(String[] args) {
        ArrayFactory af = new ArrayFactory();
        int array[] = af.getNewArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }

        Burbuja(array);
        ordenarInsercion(array);
        ordenarPorSeleccion(array);
    }

    public static void Burbuja(int[] array) {
        tiempoInicio = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Después de ordenar:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        tiempoFinal = System.nanoTime();
        System.out.println("Tiempo Ordenamineto Burbuja: " + (tiempoFinal - tiempoInicio) + " nanosegundos.");

    }

    public  static void ordenarInsercion(int[] array) {
        int aux;
        tiempoInicio = System.nanoTime();
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i - 1; j >= 0 && array[j] > aux; j--) {
                array[j + 1] = array[j];
                array[j] = aux;
            }
        }
        for (int i : array) {
            System.out.printf("%d, ", i);
        }
        tiempoFinal = System.nanoTime();
        System.out.println("Tiempo Ordenamineto Insercion: " + (tiempoFinal - tiempoInicio) + " nanosegundos.");

    }

    public static void ordenarPorSeleccion(int[] arreglo) {
        tiempoInicio = System.nanoTime();
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
        tiempoFinal = System.nanoTime();
        System.out.println("Tiempo Ordenamineto Por seleccion: " + (tiempoFinal - tiempoInicio) + " nanosegundos.");

    }

}