

public class OrdenamientoDeSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int arreglo[]= {12,1,4,3,7,8,10,45,11};

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
