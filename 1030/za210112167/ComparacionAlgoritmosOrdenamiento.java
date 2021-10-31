import java.util.ArrayList;
import java.util.Collections;

public class ComparacionAlgoritmosOrdenamiento {

    public static void main(String[] args) {

        // crea una lista
        ArrayList<Integer> al = new ArrayList<>();
        // rellena la lista
        for (int i = 0; i < 1000000; i++) {
            al.add(i, i);
        }
        // desordena la lista
        Collections.shuffle(al);

        comparar(al);

    }

    public static void comparar(ArrayList<Integer> al) {

        int[] vectorBurbuja = al.stream().mapToInt(i -> i).toArray();

        int[] vectorInsercion = al.stream().mapToInt(i -> i).toArray();

        int[] vectorSeleccion = al.stream().mapToInt(i -> i).toArray();

        long tiempoInicialBurbuja = System.currentTimeMillis();
        OrdenamientoBurbuja.burbuja(vectorBurbuja);
        long tiempoFinalBurbuja = System.currentTimeMillis();

        //System.out.println("El arreglo ordenado con burbuja es:" + Arrays.toString(vectorBurbuja));
        System.out.println("Segundos transcurridos con burbuja: " + (tiempoFinalBurbuja - tiempoInicialBurbuja) / 1000f);

        long tiempoInicialInsercion = System.currentTimeMillis();
        OrdenamientoDeInsercion.ordenarInsercion(vectorInsercion);
        long tiempoFinalInsercion = System.currentTimeMillis();

        //System.out.println("El arreglo ordenado con insercion es:" + Arrays.toString(vectorInsercion));
        System.out.println("Segundos transcurridos con insercion: " + (tiempoFinalInsercion - tiempoInicialInsercion) / 1000f);

        long tiempoInicialSeleccion = System.currentTimeMillis();
        OrdenamientoDeSeleccion.seleccion(vectorSeleccion);
        long tiempoFinalSeleccion = System.currentTimeMillis();

        //System.out.println("El arreglo ordenado con seleccion es:" + Arrays.toString(vectorSeleccion));
        System.out.println("Segundos transcurridos con seleccion: " + (tiempoFinalSeleccion - tiempoInicialSeleccion) / 1000f);

    }

}
