import java.util.*;

public class dijkstra {
    public int distancia[]= new int[10];
    public int costo [][] = new int [10][10];

    public void calcular(int n,int s){

        int bandera[]= new int[n+1];
        int i, posicionminima= 1, k,c,minimo;

        for(i=1;i<=n;i++){
            bandera[i]=0;
            this.distancia[i]=this.costo[s][i];
        }
        c=2;
        while(c<n){
            minimo=99;
            for(k=1;k<=n;k++){
                if(this.distancia[k]<minimo&&bandera[k]!=1){
                    minimo=this.distancia[i];
                    posicionminima=k;
                }
            }
            bandera[posicionminima]=1;
            c++;
            for(k=1;k<=n;k++){
                if(this.distancia[posicionminima]+this.costo[posicionminima][k] <  this.distancia[k] && bandera[k]!=1 )
                    this.distancia[k]=this.distancia[posicionminima]+this.costo[posicionminima][k];
            }

        }


    }

    public static void main(String args[]) {
        int nodos,busqueda,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nodos\n");
        nodos = in.nextInt();
        dijkstra distra = new dijkstra();
        System.out.println("Ingrese el costo y peso: \n");
        for(i=1;i<=nodos;i++)
            for(j=1;j<=nodos;j++){
                distra.costo[i][j]=in.nextInt();
                if(distra.costo[i][j]==0)
                    distra.costo[i][j]=999;
            }
        System.out.println("Ingrese el numero de vertices");
        busqueda= in.nextInt();

        distra.calcular(nodos, busqueda);
        System.out.println("La ruta mas corta desde el vertice de origen " +busqueda+"\t a todos los vertices son : \n");
        for(i=1;i<=nodos;i++)
            if(i!=busqueda)

                System.out.println("Busqueda :"+busqueda+"\t destino :"+i+"\t Costo Minimo es :"+distra.distancia[i]+"\t");
    }





}
