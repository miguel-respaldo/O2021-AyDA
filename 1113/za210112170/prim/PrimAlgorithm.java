package prim;

import java.util.Arrays;

/**
 * @program: text
 * @description: algoritmo Primm
 * @author: min
 * @create: 2019-10-18 10:50
 **/
public class PrimAlgorithm {
    public static void main(String[] args) {
        // Prueba para ver si el gráfico está bien creado
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int verxs = data.length;
        // La relación de la matriz de adyacencia está representada por una matriz bidimensional. El gran número de 10000 indica que los dos puntos no están conectados
        int[][] weight = new int[][]{{10000, 5, 7, 10000, 10000, 10000, 2}, {5, 10000, 10000, 9, 10000, 10000, 3}, {7, 10000, 10000, 10000, 8, 10000, 10000}, {10000, 9, 10000, 10000, 10000, 4, 10000}, {10000, 10000, 8, 10000, 10000, 5, 4}, {10000, 10000, 10000, 4, 5, 10000, 6}, {2, 3, 10000, 10000, 4, 6, 10000},};
        // Crear objeto MGraph
        MGraph graph = new MGraph(verxs); // Crea un objeto MinTree
        MinTree minTree = new MinTree();
        minTree.createGraph(graph, verxs, data, weight); //Salida
        minTree.showGraph(graph);
        // Prueba el algoritmo de Plim
        minTree.prim(graph, 0);//
    }
}

// Crea un árbol de expansión mínimo -> mapa de la aldea
class MinTree {
    // Crea la matriz de adyacencia del gráfico

    /**
     * @param objeto gráfico gráfico
     * @param verxs el número de vértices correspondientes al gráfico
     * @param data El valor de cada vértice del gráfico
     * @param matriz de adyacencia de peso del gráfico
     */
    public void createGraph(MGraph graph, int verxs, char data[], int[][] weight) {
        int i, j;
        for (i = 0; i < verxs; i++) {// Vertex graph.data [i] = data [i];
            for (j = 0; j < verxs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    // Mostrar la matriz de adyacencia del gráfico
    public void showGraph(MGraph graph) {
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }

    // Escribe el algoritmo prim para obtener el árbol de expansión mínimo

    /**
     * gráfico gráfico @param
     * @param v significa generar'A '-> 0'B' -> 1 ...
     */
    public void prim(MGraph graph, int v) {
        // visitado [] marca si el nodo (vértice) ha sido visitado
        int visited[] = new int[graph.verxs];
        // visitado [] El valor del elemento predeterminado es 0, lo que significa que no ha sido visitado
        /*for (int i = 0; i < graph.verxs; i++) {
            visited[i] = 0;
        }*/

        // Marcar el nodo actual como visitado
        visited[v] = 1;
        // h1 y h2 registran los subíndices de los dos vértices
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000; // Inicializar minWeight a un número grande, que será reemplazado más adelante en el proceso transversal
        for (int k = 1; k < graph.verxs; k++) {// Debido a que hay vértices graph.verxs, después de que finaliza el algoritmo de Plim, hay bordes graph.verxs-1
            // Esto es para determinar cada subgrafo generado, qué nodo es el más cercano
            for (int i = 0; i < graph.verxs; i++) {// i nodo representa el nodo que se ha visitado
                for (int j = 0; j < graph.verxs; j++) {// j nodo significa un nodo que no ha sido visitado
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        // Reemplazar minWeight (encuentra el borde con el menor peso entre el nodo que se ha visitado y el nodo que no se ha visitado)
                        minWeight = graph.weight[i][j];
                        h1 = i;
                        h2 = j;
                    }
                }
            }
            // Encuentra una arista que sea la más pequeña
            System.out.println("Lado <" + graph.data[h1] + "," + graph.data[h2] + "> Peso:" + minWeight); // Marcar el nodo actual como visitado
            visited[h2] = 1;
            // minWeight se restablece al valor máximo de 10000
            minWeight = 10000;
        }
    }
}

class MGraph {
    int verxs; // Indica el número de nodos en el gráfico
    char[] data;// Almacenar datos del nodo
    int[][] weight; // Almacenar bordes, que es nuestra matriz de adyacencia

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}