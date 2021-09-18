// http://puntocomnoesunlenguaje.blogspot.com/2015/02/ordenamiento-insercion-directa-java.html

public class OrdenamientoInsercion {

    int[] arregloSinOrden;
    int[] arregloOrdenado;

    public OrdenamientoInsercion(int[] arregloSinOrden)
    {
        this.arregloSinOrden=arregloSinOrden;
    }



    public  void Ordenar(){
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
        OrdenamientoInsercion metodo=new OrdenamientoInsercion(arregloSinOrden);

        System.out.println("Arreglo sin ordenar en "+metodo.getClass().getName()+":");
        for(int i = 0; i < arregloSinOrden.length;i++)
            System.out.print(arregloSinOrden[i]+" ");

        metodo.Ordenar();
        System.out.println("\nArreglo ordenado en "+metodo.getClass().getName()+":");
        metodo.Imprimir();
    }
}
