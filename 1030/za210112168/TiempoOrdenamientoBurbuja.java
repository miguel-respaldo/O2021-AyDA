public class TiempoOrdenamientoBurbuja {


    public static void main(String args[]) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del arreglo"));

        int arreglo [] = new int [numero];

        for(int i=0; i<numero; i++){

            arreglo[i]= (int)(Math.random()*95+5);

            System.out.println("El arreglo desordenado es: " + arreglo[i]);

        }
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
