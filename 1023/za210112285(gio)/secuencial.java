import java.util.Scanner;

public class secuencial {

    public static void main(String[] args){
        System.out.println ("Numero a buscar -> : ");
        Scanner sr = new Scanner(System.in);
        int numero = sr.nextInt();

        System.out.println ("¿Cuantos numeros hay?: ");
        int n = sr.nextInt();
        int attr[] = new int[n];
        for (int i=0;i<n;i++){
            System.out.println ("Numero: "+ String.valueOf(i+1)+":");
            attr[i]=sr.nextInt();
        }
        int indice = buscando(attr,numero,n);
        if (indice==-1){
            System.out.println ("No encontrado");
        }else{
            System.out.println (numero + "encontró que el índice es:" + index);
        }
    }
    static int  buscando(int att[],int numero ,int n){
        int indice=-1;
        for (int i=0;i<n;i++){
            if(att[i]==numero){
                indice = i;
                break;
            }else {
                indice = -1;
            }
        }
        return indice;
    }

}