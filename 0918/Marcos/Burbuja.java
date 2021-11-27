public class Burbuja{
    public static int[] ordena(int[] arreglo){
        int i,j;
        int temp;
        for(i=0;i<arreglo.length-1;i++){
            for(j=0;j<arreglo.length-1;j++){
                if (arreglo[j]>arreglo[j+1]){
                    temp=arreglo[j+1];
                    arreglo[j+1]=arreglo[j];
                    arreglo[j]=temp;
                }
            }
        }
        return arreglo;
    }

    public static void main(String[] args) {
        /* code */
        int i;
        int arreglo[]={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int arOrdenado[] = ordena(arreglo);
        for(i=0;i<arOrdenado.length;i++)
            System.out.println(arOrdenado[i]);

    }

}