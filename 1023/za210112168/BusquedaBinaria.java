import javax.swing.JOptionPane;

/**
 *
 * @author Norma Vega
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int arreglo [] = {1,2,3,4,5,6,7,8,9,10};
        int dato,inf,sup,mitad,i;
        boolean bandera= false;
        dato= Integer.parseInt((JOptionPane.showInputDialog("Digite el numero a buscar")));

        inf= 0;
        sup = arreglo.length;
        i= 0;

        mitad = (inf+sup)/2;

        while(inf <=sup && i<arreglo.length){
            if(arreglo [mitad]== dato){
                bandera = true;
                break;
            }

            if(arreglo[mitad]>dato){
                sup=mitad;
                mitad= (inf+sup)/2;
            }

            if(arreglo[mitad]<dato){
                inf=mitad;
                mitad= (inf+sup)/2;
            }
            i++;
        }
        if(bandera== true){
            JOptionPane.showMessageDialog(null,"El numero " + dato + " ha sido en encontrado en la Posicion " + mitad);
        } else{
            JOptionPane.showMessageDialog(null,"El numero " + dato + " No se encuentra en el arreglo");
        }


    }
}
