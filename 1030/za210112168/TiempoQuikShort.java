import javax.swing.JOptionPane;

/**
 *
 * @author Norma Vega
 */
public class TiempoQuikShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        //int vector[]={5,2,1,8,3,9,7};
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del arreglo"));

        int vector [] = new int [numero];

        for(int i=0; i<numero; i++){

            vector[i]= (int)(Math.random()*95+5);

        }
        System.out.println("Arreglo Original");
        mostrarArreglo(vector);

        System.out.println("Arreglo Ordenado por Quick");
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
