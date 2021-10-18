import java.util.Scanner;
public class QuickSort {
    public static void main (String [] args){
        Scanner teclado= new Scanner(System.in);

        System.out.print("Ingrese la dimension del arreglo: ");
        int tam=teclado.nextInt();
        int arreglo[]= new int[tam];

        //Ingresando valores al arreglo
        for(int i=0; i<arreglo.length; i++){
            System.out.print("A["+i+"]= ");
            arreglo[i]=teclado.nextInt();
        }

        quicksort(arreglo,0,tam-1);

        //Imprimiendo el arreglo ordenado
        System.out.println("===== Ordenamineto QuickSort ====");
        for(int i =0; i<arreglo.length;i++){
            System.out.print("\t"+arreglo[i]);
        }

    }

    //Metodo de ordenamineto Quick Sort
    static void quicksort(int arreglo[],int primero,int ultimo){
        int central,i,j;
        int pivote;
        central=(primero+ultimo)/2;
        pivote=arreglo[central];
        i=primero;
        j=ultimo;
        do{
            while(arreglo[i]<pivote) i++;
            while(arreglo[j]>pivote) j--;
            if(i<=j){
                int temp;
                temp=arreglo[i];
                arreglo[i]=arreglo[j]; /*intercambia A[i] con A[j] */
                arreglo[j]=temp;
                i++;
                j--;
            }
        }

        while(i<=j);
        if(primero<j)
            quicksort(arreglo,primero,j); /*mismo proceso con sublista izquierda*/
        if(i<ultimo)
            quicksort(arreglo,i,ultimo); /*mismo proceso con sublista derecha*/
    }


}