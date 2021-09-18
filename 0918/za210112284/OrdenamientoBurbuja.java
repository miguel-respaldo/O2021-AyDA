// http://buenasintencions.blogspot.com/2011/11/metodo-de-la-burbuja-en-java.html

public class OrdenamientoBurbuja
{
    int[] arregloSinOrden;
    int[] arregloOrdenado;

    public OrdenamientoBurbuja(int[] arregloSinOrden)
    {
        this.arregloSinOrden=arregloSinOrden;
    }


    public  void Ordenar()
    {
        int auxiliar;

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
        arregloOrdenado = arregloSinOrden;

    }

    public void Imprimir()
    {
        for(int i = 0; i < arregloOrdenado.length;i++)
            System.out.print(arregloOrdenado[i]+" ");

    }

    public static void main(String[] args)
    {
        //Valores que tiene el arreglo desordenado.

        int arregloSinOrden[] = {18,6,27,2,1,28,61,8,7,10,19,7,7,10};
        OrdenamientoBurbuja metodo=new OrdenamientoBurbuja(arregloSinOrden);

        System.out.println("Arreglo sin ordenar en "+metodo.getClass().getName()+":");
        for(int i = 0; i < arregloSinOrden.length;i++)
            System.out.print(arregloSinOrden[i]+" ");

        metodo.Ordenar();
        System.out.println("\nArreglo ordenado en "+metodo.getClass().getName()+":");
        metodo.Imprimir();



    }
}