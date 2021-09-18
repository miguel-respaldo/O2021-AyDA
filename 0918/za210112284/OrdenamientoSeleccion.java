// http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-metodo-ordenacion-seleccion.html
public class OrdenamientoSeleccion {

    int[] arregloSinOrden;
    int[] arregloOrdenado;

    public OrdenamientoSeleccion(int[] arregloSinOrden)
    {
        this.arregloSinOrden=arregloSinOrden;
    }


    public  void Ordenar() {
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

        arregloOrdenado=arregloSinOrden;
    }



    public void Imprimir()
    {
        for(int i = 0; i < arregloOrdenado.length;i++)
            System.out.print(arregloOrdenado[i]+" ");

    }



    public static void main(String[] argumentos)
    {
        int arregloSinOrden[] = {18,6,27,2,1,28,61,8,7,10,19,7,7,10};

        OrdenamientoSeleccion metodo=new OrdenamientoSeleccion(arregloSinOrden);

        System.out.println("Arreglo sin ordenar en "+metodo.getClass().getName()+":");
        for(int i = 0; i < arregloSinOrden.length;i++)
            System.out.print(arregloSinOrden[i]+" ");


        metodo.Ordenar();
        System.out.println("\nArreglo ordenado en "+metodo.getClass().getName()+":");
        metodo.Imprimir();
    }
}

