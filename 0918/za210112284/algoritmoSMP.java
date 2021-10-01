import java.util.*;

public class algoritmoSMP
{
    int numeroParejas;
    int arreglo[][];

    public algoritmoSMP(int temporal[][],int N)
    {
        this.arreglo=temporal;
        this.numeroParejas=N;
    }



    public void pareja()
    {
        int par[] = new int[numeroParejas];
        boolean libre[] = new boolean[numeroParejas];
        Arrays.fill(par, -1);

        int cuenta = numeroParejas;

        while (cuenta > 0)
        {
            int m;
            for (m = 0; m < numeroParejas; m++)
                if (!libre[m] )
                    break;
            for (int i = 0; i < numeroParejas && !libre[m] ; i++)

            {
                int w = arreglo[m][i];
                if (par[w - numeroParejas] == -1)
                {
                    par[w - numeroParejas] = m;
                    libre[m] = true;
                    cuenta--;
                }
                else
                {
                    int m1 = par[w - numeroParejas];
                    if (!preferencia(w, m, m1) )
                    {
                        par[w - numeroParejas] = m;
                        libre[m] = true;
                        libre[m1] = false;
                    }
                }
            }
        }

        System.out.println("Mujer Hombre");
        for (int i = 0; i < numeroParejas; i++)
        {
            System.out.print(" ");
            System.out.println(i + numeroParejas + "     " + par[i]);

        }
    }





    private boolean preferencia(int w, int m, int m1)
    {
        for (int i = 0; i < numeroParejas; i++)
        {
            if (arreglo[w][i] == m1)
                return true;
            if (arreglo[w][i] == m)
                return false;
        }
        return false;
    }


    // Inicio
    public static void main(String[] args)
    {
        int N=4; //numero de parejas
        int temporal[][] = new int[][]
                {
                        {7, 5, 6, 4},//mujer 1 y preferencias
                        {5, 4, 6, 7},//mujer 2 y preferencias
                        {4, 5, 6, 7},//mujer 3 y preferencias
                        {4, 5, 6, 7},//mujer 4 y preferencias

                        {0, 1, 2, 3},//Hombre 1 y preferencias
                        {0, 1, 2, 3}, //Hombre 1 y preferencias
                        {0, 1, 2, 3},//Hombre 1 y preferencias
                        {0, 1, 2, 3} //Hombre 1 y preferencias
                };

        algoritmoSMP algoritmo=new algoritmoSMP(temporal,N);
        algoritmo.pareja();

    }
}
