public class OrdenamiendoDeBurbuja {


    public static void main(String args[]) {
        int [] arreglo ={8,2,4,7,6,1,3,5,4};

        burbuja(arreglo);
        System.out.println("El arreglo ordenado es:");
        for(int i=0; i<arreglo.length;i++){
            System.out.println(".-" + arreglo[i]);
        }
    }


    public static void burbuja(int array[]){

        int aux;
        boolean cambio = false;

        while(true){
            cambio=false;
            for(int i=1; i<array.length;i++){
                if(array[i]<array[i-1]){
                    aux = array[i];
                    array[i]= array[i-1];
                    array[i-1]= aux;
                    cambio= true;

                }
            }

            if(cambio==false)
                break;
        }
    }

}
