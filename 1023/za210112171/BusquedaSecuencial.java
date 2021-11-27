package za210112171;

public class BusquedaSecuencial {

    public static void main(String[] args) {
        buscar(1);
    }

    public static boolean buscar(int val) {
        int[] lista = new int[100];    // Lista de números enteros que supondremos llena.
        lista[0]=1;
        lista[1]=2;
        lista[6]=3;
        lista[4]=4;
        boolean encontrado = false;    // Declaramos e inicializamos una bandera.
        int i = 0;            // Declaramos e inicializamos un índice.


        while ((i < 100) && !encontrado)
            if (lista[i++] == val)        // Incrementamos el índice después de la comparación
                encontrado = true;

        // Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
        if (encontrado)
            System.out.println("Sí hay algún valor " + val + " en la lista.");
        else
            System.out.println("No hay ningún valor " + val + " en la lista.");

        return encontrado;
    }

}
