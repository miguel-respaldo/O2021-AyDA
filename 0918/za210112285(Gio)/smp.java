import java.util.*;

class smp
{
    static int N = 4;//numero de parejas
    static boolean preferencia(int info[][], int w, int m, int m1)
    {
        for (int i = 0; i < N; i++)
        {
            if (info[w][i] == m1)
                return true;
            if (info[w][i] == m)
                return false;
        }
        return false;
    }

    static void pareja(int info[][])
    {
        int par[] = new int[N];
        boolean libre[] = new boolean[N];
        Arrays.fill(par, -1);
        int cuenta = N;
        while (cuenta > 0)
        {
            int m;
            for (m = 0; m < N; m++)
                if (libre[m] == false)
                    break;
            for (int i = 0; i < N &&
                    libre[m] == false; i++)
            {
                int w = info[m][i];
                if (par[w - N] == -1)
                {
                    par[w - N] = m;
                    libre[m] = true;
                    cuenta--;
                }
                else
                {
                    int m1 = par[w - N];
                    if (preferencia(info, w, m, m1) == false)
                    {
                        par[w - N] = m;
                        libre[m] = true;
                        libre[m1] = false;
                    }
                }
            }
        }

        System.out.println("Mujer Hombre");
        for (int i = 0; i < N; i++)
        {
            System.out.print(" ");
            System.out.println(i + N + "     " +
                    par[i]);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int info[][] = new int[][]{{7, 5, 6, 4},//mujer 1 y preferencias
                {5, 4, 6, 7},//mujer 2 y preferencias
                {4, 5, 6, 7},//mujer 3 y preferencias
                {4, 5, 6, 7},//mujer 4 y preferencias
                {0, 1, 2, 3},//Hombre 1 y preferencias
                {0, 1, 2, 3}, //Hombre 1 y preferencias
                {0, 1, 2, 3},//Hombre 1 y preferencias
                {0, 1, 2, 3}};//Hombre 1 y preferencias
        pareja(info);
    }
}
