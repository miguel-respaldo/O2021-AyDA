import javax.swing.JOptionPane;

/**
 *
 * @author Norma Vega
 */




public class TiempoOrdenamientoDeSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del arreglo"));

        int arreglo [] = new int [numero];

        for(int i=0; i<numero; i++){

            arreglo[i]= (int)(Math.random()*95+5);

            System.out.println("El arreglo desordenado es: " + arreglo[i]);

        }
        seleccion(arreglo);

        System.out.println("El arreglo ordenado es: ");
        for(int i=0; i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }

    }

    static void seleccion(int array[]){
        int min;
        int aux;

        for(int i=0;i<array.length;i++){
            min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(i!=min){
                aux=array[i];
                array[i]=array[min];
                array[min]=aux;
            }
        }

    }
}
