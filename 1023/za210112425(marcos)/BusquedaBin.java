public class BusquedaBin {
    public static int busca(int[] arreglo, int n,int inf,int sup){
        int mid = (sup+inf)/2;
        if(n > arreglo[mid]){
            return busca(arreglo,n,mid+1,sup);
        }
        else{
            if(n < arreglo[mid]){
                return busca(arreglo,n,inf,mid-1);
            }
            else{
                if(n == arreglo[mid]){
                    return mid;
                }
                else{
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* code */
        int i;
        int arreglo[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //Scanner reader = new Scanner(System.in);
        int num = 5;

        System.out.println("Dame el valor a buscar ");
        //num = reader.nextInt();
        int iEnc = busca(arreglo,num,0,arreglo.length-1);
        if(iEnc < 0){
            System.out.println("Elemento no encontraddo");
        }
        else{
            System.out.println("Elemento encontraddo en el indice..."+ iEnc);
        }


        for(i=0;i<arreglo.length;i++)
            System.out.println("Indice "+ i +"Elemento " + arreglo[i]);
    }
}
