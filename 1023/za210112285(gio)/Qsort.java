public class QuikShort {

    public static void main(String args[]) {

        int vector[]={11,2,5,66,33,1,10,15,80,88};
        mostrarArreglo(vector);
        quick(vector, 0,vector.length-1);

    }

    public static void quick (int []arreglo, int primero, int ultimo){
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
        int k;
        for(k=0; k<arreglo.length;k++){
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println();

    }

}
