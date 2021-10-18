import java.util.Scanner;


public class sequentialSearch {

    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println ("--------------------------");
        System.out.println ("BUSQUEDA SECUENCIAL");
        System.out.println ("By:Yazmin Salinas Perez");
        System.out.println ("--------------------------");
        System.out.println ("Ingrese el numero que desea encontrar: ");
        int fs = sr.nextInt();

        System.out.println ("¿Cuantos numeros ingresara?: ");
        int n = sr.nextInt();
        int attr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println ("Numero: "+ String.valueOf(i+1)+":");
            attr[i]=sr.nextInt();
        }
        int index = searchmy(attr,fs,n);
        if (index==-1){
            System.out.println ("No encontrado");
        }else{
            System.out.println (fs + "encontró que el índice es:" + index);
        }
    }
    static int  searchmy(int att[],int m ,int n){
        int index=-1;
        for (int i=0;i<n;i++){
            if(att[i]==m){
                index = i;
                break;
            }else {
                index = -1;
            }
        }
        return index;
    }

}
