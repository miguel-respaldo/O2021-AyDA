//import java.util.Scanner;

public class BusquedaSec{
    public static int busca(int[] arreglo, int n){
        int i;
        for(i=0;i<arreglo.length-1;i++){
            if (arreglo[i]== n){
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        /* code */
        int i;
        int arreglo[]={15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        //Scanner reader = new Scanner(System.in);
        int num = 0;

        System.out.println("Dame el valor a buscar ");
        //num = reader.nextInt();

        int iEnc = busca(arreglo,num);
        System.out.println("Elemento encontraddo en el indice..."+ iEnc);

        for(i=0;i<arreglo.length;i++)
            System.out.println("Indice "+ i +"Elemento " + arreglo[i]);
    }
}
