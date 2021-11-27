public class Insercion {
    public static int[] ordena(int[] arreglo){
        int i,j;
        int temp;
        for(i=1;i<arreglo.length;i++){
            temp=arreglo[i];
            j=i-1;
            while((j>=0)&&(temp<=arreglo[j])){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=temp;
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
