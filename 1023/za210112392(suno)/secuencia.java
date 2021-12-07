//secuencial

public class BusquedaSecuencial {

    public static void main(String[] args) {

        int maximo=100;
        int minimo=1;
        int datoBuscar=-1;


        int[] edades = new int[50];
        System.out.println("Generando datos: ");
        for (int i = 0; i < edades.length; i++) {
            edades[i] =(int) ( (Math.random()*(maximo-minimo)) + minimo);
            System.out.println(" [ edades(" + i + ")=>" + edades[i]+"]");
        }

        int indice=(int) ( (Math.random()*(49-minimo)) + minimo);
        datoBuscar=edades[indice]; //para asegurar de si encontrarlo..

        System.out.println("Datos a buscar: "+datoBuscar);
        int resultado = buscar(edades, datoBuscar);

        if (resultado != -1) {
            System.out.println("Encontrado en posicion: " + resultado);
        } else {
            System.out.println("no se encuentra en el arreglo.");
        }

    }

    public static int buscar(int[] arreglo, int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        for(int i=0;i<arreglo.length;i++) {
            if (arreglo[i] == dato)
                return i;
        }
        return -1;
    }



}

