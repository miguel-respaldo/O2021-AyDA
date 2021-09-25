
public class OrdenamientoDeInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int arreglo[] = {12,1,4,3,7,8,10,45,11};

        insercion(arreglo);

        System.out.println("El areglo completo es: ");
        for(int i=0; i<arreglo.length;i++){
            System.out.println(".-" +arreglo[i]);
        }

    }

    static void insercion (int array[]){
        int aux;
        int cont1;
        int cont2;

        for(cont1=1;cont1<array.length;cont1++){
            aux=array[cont1];
            for(cont2=cont1-1;cont2 >=0 && array[cont2]>aux;cont2--){
                array[cont2+1]=array[cont2];
                array[cont2]=aux;
            }


        }
    }

}
