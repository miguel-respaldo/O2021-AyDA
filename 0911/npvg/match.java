import java.util.*;

public class match {

    static int N =4;




    public static void main(String args[]){
       

        int preferencias [][]= new int [][] {{7, 5, 6, 4},
                {5, 4, 6, 7},
                {4, 5, 6, 7},
                {4, 5, 6, 7},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3}};

        maquinamatrimonio(preferencias);

    }


    static boolean disponibilidad(int preferencias[][], int mujer, int hombre, int m1){

        for (int i=0;i<N; i++){

            if(preferencias[mujer][i] == m1)
                return true;

            if(preferencias[mujer][i] == hombre)
                return false;


        }
        return false;
    }


    static void maquinamatrimonio (int preferencias[][]){

        int mujerPareja[] = new int [N];

        boolean hombreLibre[] = new boolean[N];

        Arrays.fill(mujerPareja, -1);

        int libre = N;

        while (libre > 0)
        {
            int hombre;
            for (hombre=0;hombre<N;hombre++)
                if(hombreLibre[hombre]== false)
                    break;

            for(int i = 0; i< N && hombreLibre[hombre]==false; i++){

                int mujer = preferencias[hombre][i];

                if(mujerPareja[mujer-N]== -1)
                {
                    mujerPareja[mujer-N] = hombre;
                    hombreLibre[hombre]= true;
                    libre--;
                }

                else
                {
                    int m1 = mujerPareja[mujer-N];

                    if(disponibilidad(preferencias,mujer,hombre,m1)==false){
                        mujerPareja[mujer-N]=hombre;
                        hombreLibre[hombre]= true;
                        hombreLibre[m1]= false;
                    }


            }
        }
        System.out.println("Mujer Hombre");
        for(int i=0; i<N; i ++){
            System.out.print(" ");
            System.out.println(i + N + "       "+ mujerPareja[i]);
        }
    }




}