public class quickSort {

    public static void main(String args[]) {

        int numbers[]={8,5,6,2,3,8,9,12,67,89,190,12,345};

        System.out.println("Before Quick Sort: ");
        mostrarArreglo(numbers);
        System.out.println("After Quick Sort");
        quickS(vector, 0,vector.length-1);

    }

    public static void quickS(int []arreglo, int primero, int ultimo){
        int i;
        int j;
        int pivote;
        int aux;

        i=primero;
        j=ultimo;

        pivote=arreglo[(primero+ultimo)/2];

        do{
            while(arreglo[i]<pivote){
                i++;
            }
            while (arreglo[j]>pivote){
                j--;
            }

            if(i<=j){
                aux = arreglo[i];
                arreglo[i] =arreglo[j];
                arreglo[j]=aux;
                i++;
                j--;

            }
        }while(i<=j);

        if(primero<j){
            quick(arreglo,primero,j);
        }
        if(i<ultimo){
            quick(arreglo,i,ultimo);
        }
        mostrarArreglo(arreglo);

    }

    public static void mostrarArreglo(int[] arreglo){
        int k;
        for(k=0; k<arreglo.length;k++){
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();
    }

}
