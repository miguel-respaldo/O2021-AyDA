package za210112168;
import javax.swing.JOptionPane;

public class BusquedaSecuencial {


    public static void main(String args[]) {

        int arreglo[] = {1,3,5,2,4};
        int dato;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

        int i=0;

        while(i<5 && bandera == false){
            if(arreglo[i]== dato){
                bandera = true;
            }
            i++;
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null,"El Numero no se encuentra en el arreglo" + dato);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero esta en el arreglo en posicion" + (i-1));
        }
    }
}
