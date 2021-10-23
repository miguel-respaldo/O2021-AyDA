import java.util.Arrays;
class Burbuja {

    public static void main(String[] args) {
        System.out.println("Ordenamiento Burbuja");

        int numeros[] = {15, 8, 33, 40, 5, 10, 17, 7, 23};
        System.out.println("=> "+Arrays.toString(numeros));
        burbuja(numeros);
        System.out.println("* "+Arrays.toString(numeros));

    }
    private static void burbuja(int[] numeros) {
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros.length - 1; y++) {
                int a = numeros[y], b = numeros[y + 1];
                if (a > b) {
                    numeros[y] = b;
                    numeros[y + 1] = a;
                    System.out.println(Arrays.toString(numeros));
                }
            }
        }
    }


}
