binaria, secuencia

package za210112284;

public class BusquedaBinaria {

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

        edades=ordenarBurbuja(edades);
        System.out.println("Datos ordenados: ");
        for (int i = 0; i < edades.length; i++)
            System.out.println(" [ edades(" + i + ")=>" + edades[i]+"]");


        int indice=(int) ( (Math.random()*(49-minimo)) + minimo);
        datoBuscar=edades[indice]; //para asegurar de si encontrarlo..

        System.out.println("Datos a buscar: "+datoBuscar);
        int resultado = buscar(edades, datoBuscar);

        if (resultado != -1) {
            System.out.println("Encontrado en posicion: " + resultado);
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

    public static int[] ordenarBurbuja(int[] edades) {

        int auxiliar;

        for(int i = 2; i < edades.length; i++)
        {
            for(int j = 0;j < edades.length-i;j++)
            {
                if(edades[j] > edades[j+1])
                {
                    auxiliar = edades[j];
                    edades[j] = edades[j+1];
                    edades[j+1] = auxiliar;
                }
            }
        }
      return edades;
    }



}