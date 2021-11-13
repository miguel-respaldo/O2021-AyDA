public class BusquedaBinaria {
    public static void main(String[] args) {

        int[] rant = new int[35];
        for (int i = 0; i < rant.length; i++)
            rant[i] = i * i;

        for (int i = 0; i < rant.length; i++)
            System.out.println("rant[" + i + "]: " + rant[i]);
        int resultado = buscar(rant, 9);
        if (resultado != -1) {
            System.out.println("Encontrado en: " + resultado);
        } else {
            System.out.println("El dato no se encuentra en el arreglo, o el arreglo no está ordenado.");
        }
    }

    public static int buscar(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato)
                return pos;
            else if (arreglo[pos] < dato) {
                inicio = pos + 1;
            } else {
                fin = pos - 1;
            }
        }
        return -1;
    }
}
