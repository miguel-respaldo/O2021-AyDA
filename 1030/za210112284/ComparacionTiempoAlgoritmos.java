public class ComparacionTiempoAlgoritmos
{

    public static void main(String[] args) {
        int maximo=100;
        int minimo=1;
        int datoBuscar=-1;

        int[] edades = new int[40000];
        System.out.println("Generando datos: ");
        for (int i = 0; i < edades.length; i++) {
            edades[i] =(int) ( (Math.random()*(maximo-minimo)) + minimo);
            System.out.println(" [ edades(" + i + ")=>" + edades[i]+"]");
        }

        Burbuja(edades);
        Insercion(edades);
        Seleccion(edades);

        System.out.println("Entrando en metodo Quicksort....");
        long tiempoInicial = System.currentTimeMillis();
        Quicksort(edades,0,edades.length-1);
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Segundos transcurridos con Quicksort: " + (tiempoFinal - tiempoInicial) / 1000f);

    }


    public static  void Burbuja(int[] arregloSinOrden)
    {
        System.out.println("Entrando en metodo Burbuja....");
        int auxiliar;
        long tiempoInicial = System.currentTimeMillis();
        for(int i = 2; i < arregloSinOrden.length; i++)
        {
            for(int j = 0;j < arregloSinOrden.length-i;j++)
            {
                if(arregloSinOrden[j] > arregloSinOrden[j+1])
                {
                    auxiliar = arregloSinOrden[j];
                    arregloSinOrden[j] = arregloSinOrden[j+1];
                    arregloSinOrden[j+1] = auxiliar;
                }
            }
        }

    long tiempoFinal = System.currentTimeMillis();
    System.out.println("Segundos transcurridos con Burbuja: " + (tiempoFinal - tiempoInicial) / 1000f);

    }

    public static void Insercion(int[] arregloSinOrden){
        System.out.println("Entrando en metodo Insercion....");
        long tiempoInicial = System.currentTimeMillis();

        int p, j;
        int aux;
        for (p = 1; p < arregloSinOrden.length; p++){ // desde el segundo elemento hasta
            aux = arregloSinOrden[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < arregloSinOrden[j])){ // mientras queden posiciones y el
                // valor de aux sea menor que los
                arregloSinOrden[j + 1] = arregloSinOrden[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            arregloSinOrden[j + 1] = aux;       // colocamos aux en su sitio
        }


        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Segundos transcurridos con Insercion: " + (tiempoFinal - tiempoInicial) / 1000f);

    }


    public static void Seleccion(int[] arregloSinOrden) {
        System.out.println("Entrando en metodo Seleccion....");
        long tiempoInicial = System.currentTimeMillis();


        int i, j, menor, pos, tmp;
        for (i = 0; i < arregloSinOrden.length - 1; i++) {      // tomamos como menor el primero
            menor = arregloSinOrden[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < arregloSinOrden.length; j++){ // buscamos en el resto
                if (arregloSinOrden[j] < menor) {           // del array algún elemento
                    menor = arregloSinOrden[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = arregloSinOrden[i];
                arregloSinOrden[i] = arregloSinOrden[pos];
                arregloSinOrden[pos] = tmp;
            }
        }

        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Segundos transcurridos con Seleccion: " + (tiempoFinal - tiempoInicial) / 1000f);

    }



    static void Quicksort(int[] arregloSinOrden,int primero,int ultimo){
        int central,i,j;
        int pivote;
        central=(primero+ultimo)/2;
        pivote=arregloSinOrden[central];
        i=primero;
        j=ultimo;

        do{
            while(arregloSinOrden[i]<pivote) i++;
            while(arregloSinOrden[j]>pivote) j--;
            if(i<=j){
                int temp;
                temp=arregloSinOrden[i];
                arregloSinOrden[i]=arregloSinOrden[j]; /*intercambia A[i] con A[j] */
                arregloSinOrden[j]=temp;
                i++;
                j--;
            }
        } while(i<=j);

        if(primero<j)
            Quicksort(arregloSinOrden,primero,j); /*buscando por la izquierda*/
        if(i<ultimo)
            Quicksort(arregloSinOrden,i,ultimo); /* buscando por la derecha*/
    }

}