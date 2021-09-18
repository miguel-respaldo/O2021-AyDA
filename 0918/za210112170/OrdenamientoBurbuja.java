import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int nn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzcaitud del array: ");
        nn = sc.nextInt();
        int ArrayN[] = new int[nn];
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Introduzcaro para el elemento " + (i + 1) + ": ");
            ArrayN[i] = sc.nextInt();
        }
        System.out.println("      -SIN ORDENAR-");
        mostrarN(ArrayN);
        System.out.println("¿Deseanar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        String res = sc2.nextLine();
        if (res.equalsIgnoreCase("S")) {
            System.out.println("       -ORDENADO-   ");
            ordenaBurbuja(ArrayN);
        }
    }

    static void ordenaBurbuja(int ArrayN[]) {
        for (int i = 0; i < ArrayN.length - 1; i++) {
            for (int j = 0; j < ArrayN.length - 1; j++) { /* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */
                if (ArrayN[j] > ArrayN[j + 1]) {
                    int temp = ArrayN[j + 1];
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
                }
            }
        }
        mostrarN(ArrayN);
    }

    static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }


}